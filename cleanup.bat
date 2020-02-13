rem Delete the previously generated .class files
IF EXIST *.class del /F /Q *.class

rem Delete the previously generated .interp files
IF EXIST *.interp del /F /Q *.interp

rem Delete the previously generated .java files
IF EXIST Step1*.java del /F /Q Step1*.java

rem Delete the previously generated .tokens files
IF EXIST *.tokens del /F /Q *.tokens

rem Delete the previously generated .out files
IF EXIST *.out del /F /Q *.out