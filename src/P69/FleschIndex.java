package P69;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FleschIndex {
    public static void main(String[] args) throws FileNotFoundException {
        String text = readFile("src/fleschindex/document.txt");
        //System.out.println(Word.numWords(text));
        //System.out.println(Word.numSyllables(text));
        //System.out.println(Word.numSentences(text));
        
        double index = 206.835
                - 84.6 * (Word.numSyllables(text) / Word.numWords(text))
                - 1.015 * (Word.numWords(text) / Word.numSentences(text));
        System.out.println(Math.round(index));
    }
    
    public static String readFile(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        String text = "";
        while(scan.hasNext()) {
            text += scan.next();
            text += " ";
        }
        
        return text.substring(0,text.length()-1);
    }
    
}