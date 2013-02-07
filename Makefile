JCC=javac
JFLAGS=-g
ANTLRJAR=antlr-3.4-complete.jar
CLASSPATH=-classpath .:$(ANTLRJAR)

JSRC=*.java

Main.class: $(JSRC)
	$(JCC) $(JFLAGS) $(CLASSPATH) *.java

help:
	java $(CLASSPATH) Main -h

run:
	java $(CLASSPATH) Main -

clean:
	rm *.class
