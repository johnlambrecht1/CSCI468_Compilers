#!/bin/bash
# echo off
clear

# Run the program
call antlr4 Step1.g4 -long-messages
javac *.java
java Driver %*