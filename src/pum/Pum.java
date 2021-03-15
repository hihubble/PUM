package pum;

import pum.analyze.LexicalAnalyzer;
import pum.analyze.SyntaxicAnalyzer;
import pum.tree.AbstractTree;

import java.io.*;

public class Pum
{
    public Pum(String file)
    {
        try {
            SyntaxicAnalyzer analyzer = new SyntaxicAnalyzer(new LexicalAnalyzer(new FileReader(file)));
            AbstractTree tree = (AbstractTree) analyzer.parse().value;

            tree.Verify();
            System.out.println("Compiled with no errors.");

            PrintWriter flot = new PrintWriter(new BufferedWriter(new FileWriter(file.replaceAll("[.]pum", ".asm"))));

            flot.println(tree.ToFASM());

            flot.close() ;
        }
        catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist") ;
        }
        catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        if(args.length == 0) {
            System.out.println("Type --help to get help");
        }
        else {
            new Pum(args[0]);
        }
    }
}
