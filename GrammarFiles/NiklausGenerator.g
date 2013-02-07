tree grammar NiklausGenerator;

options {
  language = Java;
  tokenVocab = Niklaus;
  ASTLabelType = CommonTree;
}

@header{
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.io.PrintStream;

}

@members{
  public PrintStream out = System.out;
  public StringTemplateGroup group =  new StringTemplateGroup("myGroup", "src/StringTemplates/", DefaultTemplateLexer.class);
  public StringTemplate module = group.getInstanceOf("module");
  
  public String niklausToJavaType(String type){
     switch(type){
     case "COUNT": return "int"; 
     case "FLOAT": return "double";
     case "TRUTH": return "boolean"; 
     }
     return null;
  }
  
}

module: 
  ^(MODULE id=IDENTIFIER {module.setAttribute("name", $id.getText());}
  declarations 
  body) {out.println(module.toString());}
                                            
  ;
 
declarations: 
  ^(DECLARATIONS (d=declaration{module.setAttribute("global_variables", d);})*) 
  ;

body:
^(BODY (s=statement{module.setAttribute("statements", s);})* )
  ;
  
declaration returns [String string]:
  c=constantdeclaration {string = c;}
  | v=variabledeclaration {string = v;}
  | f=functiondeclaration {string = "\n" + f;}
  | p=proceduredeclaration {string = "\n" + p;}
  ;
  
constantdeclaration returns [String string]:
  ^(CONST ^(t=TYPE id=IDENTIFIER e=expression)) {StringTemplate constant = group.getInstanceOf("constant");
                                                 
                                                 constant.setAttribute("type", niklausToJavaType($t.getText()));                                        
                                                 constant.setAttribute("name", $id.getText());
                                                 constant.setAttribute("value", e); 
                                                 
                                                 string = constant.toString();
                                                }
  ;
  
variabledeclaration returns [String string]:
  ^(VAR{StringTemplate variables = group.getInstanceOf("variables");} 
   (i=individualvariabledeclaration{variables.setAttribute("variable", i);})+){
                                                                               string= variables.toString();
                                                                              }
  ;
 
individualvariabledeclaration returns [String string]: 
  ^(t=TYPE id=IDENTIFIER) {StringTemplate variable = group.getInstanceOf("variable");
                           
                           variable.setAttribute("type", niklausToJavaType($t.getText()));
                           variable.setAttribute("name", $id.getText());

                           string = variable.toString();
                          }
  ;
  
  localvariabledeclaration returns [String string]:
  ^(VAR{StringTemplate localvariables = group.getInstanceOf("localvariables");} 
   (i=individuallocalvariabledeclaration{localvariables.setAttribute("variable", i);})+){
                                                                               string= localvariables.toString();
                                                                              }
  ;
 
individuallocalvariabledeclaration returns [String string]: 
  ^(t=TYPE id=IDENTIFIER) {StringTemplate localvariable = group.getInstanceOf("localvariable");
                           
                           localvariable.setAttribute("type", niklausToJavaType($t.getText()));
                           localvariable.setAttribute("name", $id.getText());

                           string = localvariable.toString();
                          }
  ;
  
functiondeclaration returns [String string]:
  ^(FUNCTION id=IDENTIFIER t=TYPE {StringTemplate function = group.getInstanceOf("function");
                                   function.setAttribute("name", id.getText());
                                   function.setAttribute("type", niklausToJavaType($t.getText()));
                                   if($t.getText().equals("TRUTH")) function.setAttribute("default","false");
                                   else function.setAttribute("default","0");
                                  }
  p=parameterlist {function.setAttribute("parameters", p);} 
  ^(DECLARATIONS (v=localvariabledeclaration{function.setAttribute("local_variables", v);})*) 
  ^(BODY (s=statement{function.setAttribute("statements", s);})*)) 
  {string = function.toString();}
  ;
  
proceduredeclaration returns [String string]:
  ^(FUNCTION id=IDENTIFIER {StringTemplate procedure = group.getInstanceOf("procedure");
                                   procedure.setAttribute("name", id.getText());
                                  }
  p=parameterlist {procedure.setAttribute("parameters", p);} 
  ^(DECLARATIONS (v=localvariabledeclaration{procedure.setAttribute("local_variables", v);})*) 
   ^(BODY (s=statement{procedure.setAttribute("statements", s);})*)) 
  {string = procedure.toString();}
  ;
  
parameterlist returns [String string]:
  ^(PARAM {StringTemplate parameters = group.getInstanceOf("parameters");} 
   (p=parameters {parameters.setAttribute("parameter",p);})*)
   {string = parameters.toString();}
  ;

parameters  returns [String string]:
 ^(t=TYPE id=IDENTIFIER){StringTemplate parameter = group.getInstanceOf("parameter");
                         parameter.setAttribute("name", id.getText());
                         parameter.setAttribute("type", niklausToJavaType(t.getText()));
                         string = parameter.toString();
                        }
  ;
 
statement returns [String string]:
  a=assignment {string = a + ";";} 
  | o=output {string = o + ";";}
  | c=conditional {string = c ;} 
  | l=loop {string = l;}
  | p=procedurecall {string = p + ";";}
  | ^(BODY {StringTemplate block = group.getInstanceOf("block");} 
    (s=statement {block.setAttribute("statement", s);} )*)
    {string = block.toString();}
  ; 
  
assignment returns [String string]:
  ^(DEFINEDAS id=IDENTIFIER e=expression) {StringTemplate assignment = group.getInstanceOf("assignment");
                                           assignment.setAttribute("variable", id.getText());
                                           assignment.setAttribute("expression", e);
                                           string = assignment.toString();
                                          }
  ;
  
output returns [String string]:
  ^(OUTPUT {StringTemplate output = group.getInstanceOf("output");}
   (s=STRINGLITERAL {output.setAttribute("string", s.getText());}
   | id= IDENTIFIER {output.setAttribute("string", id.getText());} )) 
   {string = output.toString();}
  ;
  
conditional returns [String string]:
  ^(IF b=expression s1=statement {StringTemplate ifStatement = group.getInstanceOf("if");
                                    ifStatement.setAttribute("condition", b);
                                    ifStatement.setAttribute("if_body", s1); 
                                    string = ifStatement.toString();
                                   } 
  (s2=statement{StringTemplate elseStatement = group.getInstanceOf("else");
             elseStatement.setAttribute("else_body", s2);
             string = string + "\n" + elseStatement.toString();
            })?)
  ;
  
loop returns [String string]:
  w=whileloop {string = w;}
  | r=repeatloop {string = r;}
  ;
  
whileloop returns [String string]:
  ^(WHILE b=expression s=statement) {StringTemplate whileloop = group.getInstanceOf("whileloop");
                                            whileloop.setAttribute("condition", b);
                                            whileloop.setAttribute("body", s);
                                            string = whileloop.toString();
                                           }
  ;

repeatloop returns [String string]:
  ^(REPEAT s=statement b=expression) {StringTemplate repeatloop = group.getInstanceOf("repeatloop");
                                         repeatloop.setAttribute("condition", b);
                                         repeatloop.setAttribute("body", s);
                                         string = repeatloop.toString();
                                        }
  ;
  
procedurecall returns [String string]:
  ^(id=IDENTIFIER  {StringTemplate procedureCall = group.getInstanceOf("procedurecall");
                    procedureCall.setAttribute("name",id.getText());
                   }
   ^(PARAM (e=expression {procedureCall.setAttribute("parameter", e); }
     )*)) 
     {string = procedureCall.toString();}
  ; 
  
expression returns [String string]:
   a=arithmeticexpression {string = a;}
   | b=booleanexpression {string = b;}
  ;

arithmeticexpression returns [String string]:
  ^(op=(ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION) a1=arithmeticexpression a2=arithmeticexpression) {StringTemplate binaryoperation = group.getInstanceOf("binaryoperation");
                                                                                                              binaryoperation.setAttribute("operator", op.getText());  
                                                                                                              binaryoperation.setAttribute("operand1", a1);  
                                                                                                              binaryoperation.setAttribute("operand2", a2);  
                                                                                                              string = binaryoperation.toString();
                                                                                                             } 
  | ^(NEGATE a1=arithmeticexpression) {string = "(- " + a1 + ")";}
  | ^(ADDITION at=(COUNT|FLOAT)) {string = at.toString();}
  | c=COUNT {string = c.getText();}
  | f=FLOAT {if (f.getText().matches(".([eE][+-]?[0-9]+)?")) string = "0.0"; 
             else string = new Double(Double.parseDouble(f.getText())).toString();}
  | id=IDENTIFIER {string = id.getText();}
  | p=procedurecall {string = p;}
  ;

booleanexpression returns [String string]: 
  ^(op=(EQUALITY | NONEQUALITY | COMPARISON) a1=arithmeticexpression a2=arithmeticexpression) {StringTemplate binaryoperation = group.getInstanceOf("binaryoperation");
                                                                                            binaryoperation.setAttribute("operator", op.getText());  
                                                                                            binaryoperation.setAttribute("operand1", a1);  
                                                                                            binaryoperation.setAttribute("operand2", a2);  
                                                                                            string = binaryoperation.toString();
                                                                                            }  
  ; 
  