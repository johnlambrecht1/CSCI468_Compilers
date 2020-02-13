import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.FileWriter;

public class Driver {

    public static void main(String[] args) throws Exception     {

        String[] tokens = args[0].split("\\.");
        // System.out.println( "tokens = " + tokens ); // debugging output
        String file = tokens[0];
        // System.out.println( "file = " + file ); // debugging output
        CharStream chars = CharStreams.fromFileName( "./" + args[0] );
        // System.out.println( "chars = " + chars ); // debugging output
        Step1Lexer step1Lexer = new Step1Lexer( chars );
        // System.out.println( "step1Lexer = " + step1Lexer ); // debugging output
        Vocabulary vocabulary = step1Lexer.getVocabulary();
        // System.out.println( "vocabulary = " + vocabulary ); // debugging output
        Token current = step1Lexer.nextToken();

        // System.out.println( "Output to " + file ); // output notification
        FileWriter fileWriter = new FileWriter( file + ".out"); // get file writer ready

        String tokenValue = current.getText() ;

        while( tokenValue != "<EOF>" ){
            // output token info
            int tokenTypeNumber = current.getType() ; // get token number
            String tokenTypeName = vocabulary.getSymbolicName( tokenTypeNumber ) ; //convert token number to name
            System.out.println( "Token Type: " + tokenTypeName ) ;     // write to screen
            fileWriter.write( "Token Type: " + tokenTypeName + '\n' ); // write to file

            // output value info
            tokenValue = current.getText() ;
            System.out.println( "Value: " + tokenValue );      // write to screen
            fileWriter.write( "Value: " + tokenValue + '\n' ); // write to file

            // move to next token
            current = step1Lexer.nextToken();
        }
        fileWriter.close(); //close the file writer
    }
}