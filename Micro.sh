#!/bin/bash
#echo off
clear

# list aliases
#alias -p

# list exports (for CLASSPATH)
#export -p

# create CLASSPATH
#export CLASSPATH=".:/home/jason/antlr4/antlr-4.8-complete.jar:$CLASSPATH"

# Load grammar into Antlr4
java -Xmx500M org.antlr.v4.Tool Step1.g4

# compile java files
javac *.java 

# run java on Driver against input program file for grammar analysis
java Driver $@
