package compiler;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileWriter;

public class Driver {

    public static void main(String[] args) throws Exception {

        // args[0] is the first argument and the filename with extension
        // fullFileName is an array with the filename broken up into parts, name and extension
        // file is just the name of the file, without extension

        String fullFileName = args[0];
        //System.out.println( "fullFileName = " + fullFileName ); // debugging output
        //System.out.println( "args[0] = " + args[0] ); // debugging output
        // File name is the first argument
        //System.out.println( "file = " + file ); // debugging output

        // chars is all of the characters in the file
        CharStream chars = CharStreams.fromFileName( fullFileName );

        //System.out.println( "chars = " + chars ); // debugging output

        // create the lexer from the chars
        littleLexer step1Lexer = new littleLexer( chars );
        CommonTokenStream token = new CommonTokenStream(step1Lexer);
        littleParser parser = new littleParser(token);
        parser.removeErrorListeners();


        //FileWriter step2_file = new FileWriter((fullFileName.replace(".micro", "")) + ".out");


        	 parser.program();



        if ((parser.getNumberOfSyntaxErrors()) == 0) {
        	//String result = "Accepted";
        	System.out.println("Accepted");
        }
        else {
        	//String result = "Not Accepted";
        	System.out.println("Not accepted");
        }

        //step2_file.close();


    }
}
