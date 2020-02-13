rem  echo off
cls

rem Run the program

call antlr4 Little.g4 -long-messages
javac *.java
java Driver %*