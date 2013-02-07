tree grammar NiklausChecker;

options {
  language = Java;
  tokenVocab = Niklaus;
  ASTLabelType = CommonTree;
}

@header{

import java.util.HashMap;
import java.util.Map;

import java.util.HashSet;
import java.util.Set;

}

@members {
  public Error err = new Error(System.err);

  public void error(int line, int chr, String msg){
   err.error(line, chr, msg);
   Niklaus.fail = true; 
  }
    
  public static final boolean DEBUG = false;
  
  private enum Type { 
    COUNT, TRUTH, FLOAT 
  } 

  private String moduleName;
  private String functionName;
  
  public void setModuleName(String name){
    moduleName = name;   
  } 
  
  public void setFunctionName(String name){
    functionName = name;
  }

  private Set<String> procedures = new HashSet<String>();
  private Map<String, Type> functions = new HashMap<String, Type>();
  private Map<String, Type> globalVariables = new HashMap<String, Type>();
  private Map<String, Type> constants = new HashMap<String, Type>();
  private Map<String, Type> localVariables = new HashMap<String, Type>();
  private Map<String, Type> parameters = new HashMap<String, Type>();
  private Map<String, List<String>> orderedParameters = new HashMap<String, List<String>>();

  public void declareProcedure(String identifier){
    procedures.add(identifier);
  }

  public void declareFunction(String identifier, Type type){
    functions.put(identifier,type);
  } 

  public void declareGlobalVariable(String identifier, Type type){
    globalVariables.put(identifier,type);
  }

  public void declareConstant(String identifier, Type type){
    constants.put(identifier, type);
  } 

  public void declareLocalVariable(String identifier, Type type){
    localVariables.put(functionName + identifier, type);
  } 

  public void declareParameter(String identifier, Type type){
    parameters.put(functionName + identifier, type);
    if(!orderedParameters.containsKey(functionName)){
      orderedParameters.put(functionName, new ArrayList<String>());
    }
    orderedParameters.get(functionName).add(identifier);
    
  }

  public boolean isDeclaredGlobally(String identifier){
    if( (!identifier.equals(moduleName))
        && (!procedures.contains(identifier))
        && (!functions.containsKey(identifier))
        && (!globalVariables.containsKey(identifier))
        && (!constants.containsKey(identifier))){
      return false;
    }
    else return true;
  }
  
  public boolean isDeclaredLocally(String identifier){
    if( (!localVariables.containsKey(functionName + identifier))
        && (!parameters.containsKey(functionName + identifier))){
      return false;
    }
    else return true;
  }

  public Type getFunctionType(String identifier){
    return functions.get(identifier);
  }
  
  public Type getGlobalVariableType(String identifier){
    return globalVariables.get(identifier);
  }
  
  public Type getConstantType(String identifier){
    return constants.get(identifier);
  }
  
  public Type getLocalVariableType(String identifier){
    return localVariables.get(functionName + identifier);
  }
  
  public Type getParameterType(String functionName, String identifier){
    return parameters.get(functionName + identifier);
  }
  
  public Type getParameterType(String functionName, int number){
    if (orderedParameters.get(functionName) != null)
    return getParameterType(functionName, orderedParameters.get(functionName).get(number));
    else return null;
  }
  
  public int getNumberOfParameters(String functionName){
    if (orderedParameters.get(functionName) != null)
      return orderedParameters.get(functionName).size();
      else return 0;
  }
  
  public Type getType(String identifier){
    if (parameters.containsKey(functionName + identifier)) return parameters.get(functionName +  identifier);
    if (localVariables.containsKey(functionName + identifier)) return localVariables.get(functionName + identifier);
    if (moduleName == identifier) return null;
    if (procedures.contains(identifier)) return null;
    if (functions.containsKey(identifier)) return functions.get(identifier);
    if (globalVariables.containsKey(identifier)) return globalVariables.get(identifier);
    if (constants.containsKey(identifier)) return constants.get(identifier);
    if (functionName == identifier) return null;
    return null;
  }
  
  public Type stringToType(String string){
    if(string.equals("TRUTH")) return Type.TRUTH;
    else if(string.equals("COUNT")) return Type.COUNT;
    else if(string.equals("FLOAT")) return Type.FLOAT;
    else return null;
  }
  
  public boolean isVariable(String identifier){
    if (globalVariables.containsKey(identifier)) return true;
    if (localVariables.containsKey(functionName + identifier)) return true;
    if (parameters.containsKey(functionName + identifier)) return true;
    return false;
  }
  
  public boolean isFunction(String identifier){
    if (functions.containsKey(identifier)) return true;
    else return false;
  }
  
  public boolean isProcedure(String identifier){
    if (procedures.contains(identifier)) return true;
    else return false;
  }
  
  public String getFunctionName(){
    return functionName;
  }
}

module: 
  ^(MODULE id=IDENTIFIER {setModuleName(id.getText());} declarations body) 
  ;

declarations: 
  ^(DECLARATIONS declaration*)
  ;

body:
^(BODY statement*)
  ;
  
declaration:
  constantdeclaration
  | globalvariabledeclaration 
  | functiondeclaration 
  | proceduredeclaration
  ;
  
constantdeclaration:
  ^(CONST ^(t=TYPE id=IDENTIFIER e=expression)) {Type type = stringToType(t.getText()); 
                                                 if(!isDeclaredGlobally(id.getText())){
                                                     declareConstant(id.getText(), type);
                                                     if(type == e.type){ 
                                                         if(DEBUG) System.out.println("Constant declared"); 
                                                     }
                                                     else{
                                                         if(DEBUG) System.out.println("Type Mismatch!");
                                                         error(e.lineNumber, e.charPosition, "Type mismatch");
                                                     }
                                                 }
                                                 else{ 
                                                     if(DEBUG) System.out.println("Identifier in use!");
                                                      error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                                                 }
                                                 //System.out.println($id.getCharPositionInLine() + ", " +  $id.getLine());
                                               }
  ;
  
globalvariabledeclaration:
  ^(VAR individualglobalvariabledeclaration+)
  ;
 
individualglobalvariabledeclaration: 
  ^(t=TYPE id=IDENTIFIER) {Type type = stringToType(t.getText()); 
                           if(!isDeclaredGlobally(id.getText())){
                               declareGlobalVariable(id.getText(), type);
                               if(DEBUG) System.out.println("Global Variable declared");
                           }
                           else{ 
                               if(DEBUG) System.out.println("Identifier in use!");
                               error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                           }
                           }
  ;
  
localvariabledeclaration:
  ^(VAR individuallocalvariabledeclaration+)
  ;
 
individuallocalvariabledeclaration: 
   ^(t=TYPE id=IDENTIFIER) {Type type = stringToType(t.getText()); 
                            if(!isDeclaredLocally(id.getText())){
                                declareLocalVariable(id.getText(), type);
                                if(DEBUG) System.out.println("Local Variable declared");
                            }
                            else{ 
                                if(DEBUG) System.out.println("Identifier in use!");
                                error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                            }
                           }
  ;
  
functiondeclaration:
  ^(FUNCTION id=IDENTIFIER t=TYPE {Type type = stringToType(t.getText());
                                   if(!isDeclaredGlobally(id.getText())){
                                       setFunctionName(id.getText());
                                       declareFunction(id.getText(), type);
                                       declareLocalVariable(id.getText(), type);
                                       if(DEBUG) System.out.println("Function declared");
                                   }
                                   else{ 
                                       if(DEBUG) System.out.println("Identifier In Use!");
                                       error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                                   }
                                  }
  parameterlist ^(DECLARATIONS localvariabledeclaration*) ^(BODY statement*)) {setFunctionName("null");}
  ;
  
proceduredeclaration:
  ^(FUNCTION id=IDENTIFIER {if(!isDeclaredGlobally(id.getText())){
                                 setFunctionName(id.getText());
                                 declareProcedure(id.getText());
                                 if(DEBUG) System.out.println("Procedure declared");
                            }
                            else{ 
                                if(DEBUG) System.out.println("Identifier In Use!");
                                error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                            }
                           }
  parameterlist ^(DECLARATIONS localvariabledeclaration*) ^(BODY statement*)) {setFunctionName("null");}
  ;
  
parameterlist:
  ^(PARAM parameters*)
  ;

parameters:
 ^(t=TYPE id=IDENTIFIER){Type type = stringToType(t.getText()); 
                            if(!isDeclaredLocally(id.getText())){
                                declareParameter(id.getText(), type);
                                if(DEBUG) System.out.println("Parameter declared");
                            }
                            else{ 
                                if(DEBUG) System.out.println("Identifier in use!");
                                error($id.getLine(), $id.getCharPositionInLine(), "Identifier in use");
                            }
                   }
  ;
 
statement:
  assignment
  | output
  | conditional
  | loop
  | p=procedurecall {if (p.type != null) error(p.lineNumber, p.charPosition, "Functions may only be called inside expressions");}
  | ^(BODY statement*)
  ;
  
assignment:
  ^(DEFINEDAS id=IDENTIFIER e=expression){if(((isDeclaredGlobally(id.getText())) && !isFunction(getFunctionName())) || (isDeclaredLocally(id.getText()))){
                                              if(isVariable(id.getText())){
                                                  if (getType(id.getText()) == e.type){ 
                                                      if(DEBUG) System.out.println("Assigned"); 
                                                  }
                                                  else{ 
                                                      if(DEBUG) System.out.println("Incompatible type!"); 
                                                      error(e.lineNumber, e.charPosition, "Incompatible types");
                                                  }
                                              }
                                              else{ 
                                                  if(DEBUG) System.out.println("Not a variable!");
                                                  error($id.getLine(), $id.getCharPositionInLine(), "Values cannot be assigned to this identifier");
                                              }
                                          }
                                          else{ 
                                              if(DEBUG) System.out.println("Unknown identifier!");
                                              error($id.getLine(), $id.getCharPositionInLine(), "Identifier has not been declared");
                                          }
                                         }
  ;
  
output:
  ^(OUTPUT (STRINGLITERAL | id= IDENTIFIER{
                  Type type;
                  if(isDeclaredLocally(id.getText()) && getFunctionName() != null){
                      type = getType(id.getText()); 
                      if(type != null) if(DEBUG) System.out.println("Local Variable ok");
                   }
                   else if(!(isFunction(getFunctionName()) && isVariable(id.getText())) && isDeclaredGlobally(id.getText()) && !(isFunction(id.getText()) || isProcedure(id.getText()))){
                        type = getType(id.getText()); 
                        if(type != null) if(DEBUG) System.out.println("Global Variable ok");
                   }
                   else{ 
                       if(DEBUG) System.out.println("Variable is not defined in this scope!");
                       error($id.getLine(), $id.getCharPositionInLine(), "Variable not defined in scope");
                   }
                  } )) 
  ;
  
conditional:
  ^(IF e=expression {if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");} statement statement?)
  ;
  
loop:
  whileloop
  | repeatloop
  ;
  
whileloop:
  ^(WHILE (e=expression) {if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");} statement)
  ;

repeatloop:
  ^(REPEAT statement (e=expression) {if (e.type != Type.TRUTH)  error(e.lineNumber, e.charPosition, "Variable not of type: TRUTH");})
  ;
  
procedurecall returns [Type type, int lineNumber, int charPosition]:
  ^(id=IDENTIFIER {
                   int i = 0;
                   if((!isVariable(id.getText()) || getFunctionName().equals(id.getText()))&& (isFunction(id.getText()) || isProcedure(id.getText()))){
                      $type = getType(id.getText()); 
                      if(DEBUG) System.out.println("Function Exists");
                   }
                   else { 
                      if(DEBUG) System.out.println("Function Doesn't exist!");
                      error($id.getLine(), $id.getCharPositionInLine(), "Function has not been declared");
                   }
                  } 
   ^(PARAM (e=expression {if(isFunction(id.getText()) || isProcedure(id.getText())){
                    if(i < getNumberOfParameters(id.getText())){ 
                        if(e.type == getParameterType(id.getText(), i)){
                            if(DEBUG) System.out.println("Parameter Seems OK"); 
                        }
                        else{ 
                            if(DEBUG) System.out.println("Type mismatch!"); 
                            error(e.lineNumber, e.charPosition, "Type mismatch");
                        }
                    }
                    else if(DEBUG) System.out.println("Parameter limit exeeded"); 
                  i++;
                  }
                 } )*)) {if(i == getNumberOfParameters(id.getText())){ 
                            if(DEBUG) System.out.println("Correct number of Parameters"); 
                         }
                         else{ 
                            if(DEBUG) System.out.println("Incorrect number of Parameters!");
                            error($id.getLine(), $id.getCharPositionInLine(), "Incorrect number of parameters");
                        }
                         $lineNumber = id.getLine(); 
                         $charPosition = id.getCharPositionInLine();
                       }
  ; 
  
expression returns [Type type, int lineNumber, int charPosition]:
   a=arithmeticexpression {$type = a.type; $lineNumber = a.lineNumber; $charPosition = a.charPosition;}
   | ^((EQUALITY | NONEQUALITY | COMPARISON) a1=arithmeticexpression a2=arithmeticexpression) {if(a1.type == a2.type){ 
                                                                                                  if(DEBUG) System.out.println("Boolean expression ok"); 
                                                                                              }
                                                                                              else {
                                                                                                  if(DEBUG) System.out.println("Type Mismatch!");
                                                                                                  error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                              }
                                                                                              $type = Type.TRUTH; $lineNumber = a1.lineNumber; $charPosition = a1.charPosition;}
  ;

arithmeticexpression returns [Type type, int lineNumber, int charPosition]:
  ^((ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION) a1=arithmeticexpression a2=arithmeticexpression) {if(a1.type == a2.type) {
                                                                                                               if (a1.type != Type.TRUTH){
                                                                                                                   if(DEBUG) System.out.println("Expression ok"); 
                                                                                                               }
                                                                                                               else{ 
                                                                                                                   if(DEBUG) System.out.println("Not an arithmetic type!"); 
                                                                                                                   error(a1.lineNumber, a1.charPosition, "Invalid type");
                                                                                                               }
                                                                                                           }
                                                                                                           else{ 
                                                                                                               if(DEBUG) System.out.println("Types do not match!");  
                                                                                                               error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                                           }
                                                                                                           $type = a1.type;
                                                                                                           $lineNumber = a1.lineNumber; 
                                                                                                           $charPosition = a1.charPosition;
                                                                                                          }
  | c=COUNT {$type = Type.COUNT; $lineNumber = c.getLine(); $charPosition = c.getCharPositionInLine();}
  | f=FLOAT {$type = Type.FLOAT; $lineNumber = f.getLine(); $charPosition = f.getCharPositionInLine();}
  | id=IDENTIFIER {   if(isDeclaredLocally(id.getText()) && getFunctionName() != null){
                      $type = getType(id.getText()); 
                      if($type != null) if(DEBUG) System.out.println("Local Variable ok");
                   }
                   else if(!(isFunction(getFunctionName()) && isVariable(id.getText())) && isDeclaredGlobally(id.getText()) && !(isFunction(id.getText()) || isProcedure(id.getText()))){
                        $type = getType(id.getText()); 
                        if($type != null) if(DEBUG) System.out.println("Global Variable ok");
                   }
                   else{ 
                       if(DEBUG) System.out.println("Variable is not defined in this scope!");
                       error($id.getLine(), $id.getCharPositionInLine(), "Variable not defined in scope");
                   }
                   if($type == Type.COUNT || $type== Type.FLOAT || $type == Type.TRUTH) {
                       if(DEBUG) System.out.println("Arithmetic Type OK (VAR)");
                   }
                   else{ 
                       if(DEBUG) System.out.println("Arithmetic Type invalid!");
                       error($id.getLine(), $id.getCharPositionInLine(), "Arithmetic type invalid");
                   }
                   $lineNumber = id.getLine(); 
                   $charPosition = id.getCharPositionInLine();
                  }
  | ^(NEGATE a1=arithmeticexpression) {if(DEBUG) System.out.println("Negate ok"); 
                                       $type = a1.type; 
                                       if($type == Type.TRUTH) error(a1.lineNumber, a1.charPosition, "Negation cannot be applied to Type TRUTH"); 
                                       }
  | ^(a=ADDITION at=atom) {if(DEBUG) System.out.println("Positive ok"); 
                                         $type = at.type;
                                                                                 
                                         if(at.charPosition - a.getCharPositionInLine() > 1){
                                            error(a.getLine(), a.getCharPositionInLine(), "There can be no spaces between an integer and it's sign");
                                         }
                                         
                                        }
  | p=procedurecall {$type = p.type; 
                     if($type == Type.TRUTH || $type == Type.COUNT || $type== Type.FLOAT) {
                         if(DEBUG) System.out.println("Arithmetic Type OK (FUNC)");
                     }
                     else{ 
                         if(DEBUG) System.out.println("Arithmetic Type invalid!");
                         error(p.lineNumber, p.charPosition, "Arithmetic type invalid");
                     }
                     $lineNumber = p.lineNumber; 
                     $charPosition = p.charPosition;
                    }
  ;

atom  returns [Type type, int lineNumber, int charPosition]:
    c=COUNT {$type = Type.COUNT; $lineNumber = c.getLine(); $charPosition = c.getCharPositionInLine();}
  | f=FLOAT {$type = Type.FLOAT; $lineNumber = f.getLine(); $charPosition = f.getCharPositionInLine();}
  ;


booleanexpression:
    ^((EQUALITY | NONEQUALITY | COMPARISON) a1=arithmeticexpression a2=arithmeticexpression) {if(a1.type == a2.type){ 
                                                                                                  if(DEBUG) System.out.println("Boolean expression ok"); 
                                                                                              }
                                                                                              else {
                                                                                                  if(DEBUG) System.out.println("Type Mismatch!");
                                                                                                  error(a1.lineNumber, a1.charPosition, "Types do not match");
                                                                                              }
                                                                                             } 
  ; 
  