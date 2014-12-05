package P69;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FleschIndex {
    public static void main(String[] args) throws FileNotFoundException {
        String text = readFile("src/P69/document.txt");
        
        double index = 206.835
                - 84.6 * ((double)Word.numSyllables(text) / Word.numWords(text))
                - 1.015 * ((double)Word.numWords(text) / Word.numSentences(text));
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