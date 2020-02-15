import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.FileWriter;

public class Driver {

    public static void main(String[] args) throws Exception {

        // args[0] is the first argument and the filename with extension
        // fullFileName is an array with the filename broken up into parts, name and extension
        // file is just the name of the file, without extension

        String[] fullFileName = args[0].split("\\.");
        //System.out.println( "fullFileName = " + fullFileName ); // debugging output
        //System.out.println( "args[0] = " + args[0] ); // debugging output
        String file = fullFileName[0]; // File name is the first argument
        //System.out.println( "file = " + file ); // debugging output

        // chars is all of the characters in the file
        CharStream chars = CharStreams.fromFileName( "./" + args[0] );
        //System.out.println( "chars = " + chars ); // debugging output

        // create the lexer from the chars
        Step1Lexer step1Lexer = new Step1Lexer( chars );
        //System.out.println( "step1Lexer = " + step1Lexer ); // debugging output

        // vocabulary is the array of tokens, which can be broken down further
        Vocabulary vocabulary = step1Lexer.getVocabulary();
        //System.out.println( "vocabulary = " + vocabulary ); // debugging output

        // create current for token use and move to next token
        Token current = step1Lexer.nextToken();

        // output is used to simply screen listing and file storing of output
        String output = "";

        // System.out.println( "Output to " + file ); // output notification

        // get file writer ready, use file.out as the destination
        FileWriter fileWriter = new FileWriter( file + ".out");

        // grab the initial tokenValue so that the while loop can work
        String tokenValue = current.getText() ;

        while( tokenValue != "<EOF>" ) {
            // get token variables
            int tokenTypeNumber = current.getType() ; // get token number
            String tokenTypeName = vocabulary.getSymbolicName( tokenTypeNumber ) ; //convert token number to name
            tokenValue = current.getText() ;

            // output token info
            if ( tokenValue != "<EOF>" ) {
            	output = "Token Type: " + tokenTypeName + '\n' ;
                System.out.print( output ) ; // write to screen
                fileWriter.write( output ) ; // write to file

                output = "Value: " + tokenValue + '\n' ;
                System.out.print( output ) ; // write to screen
                fileWriter.write( output ) ; // write to file
            }

            // move to next token
            current = step1Lexer.nextToken();
        }
        fileWriter.close(); //close the file writer
    }
}
