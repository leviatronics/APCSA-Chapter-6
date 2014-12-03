package P69;

import java.util.Arrays;

public class Word {
    public static int numWords(String text) {
        int words = 0;
        char[] chars = text.toCharArray();
        for (char i : chars)
        {
            if (i == ' ' || i == '\n' || i == '\t')
            {
                words++;
            }
        }
        return words;
    }
    
    public static int numSyllables(String text) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] chars = text.split("");
        int syllables = 0;
        int syllablesInWord = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Arrays.asList(vowels).contains(chars[i].toLowerCase()))
            {
                if(i > 0 && !Arrays.asList(vowels).contains(chars[i-1].toLowerCase()))
                {
                    syllables++;
                    syllablesInWord++;
                }
            }
            if (chars[i].equals(" ") || chars[i].equals("\t") || chars[i].equals("\n"))
            {
                if (syllablesInWord == 0)
                {
                    syllables++;
                    syllablesInWord++;
                }
                syllablesInWord = 0;
            }
        }
        
        return syllables;
    }
    
    public static int numSentences(String text) {
        int sentences = 0;
        char[] chars = text.toCharArray();
        for (char i : chars)
        {
            if (i == '.' || i == ':' || i == ';' || i == '?' || i =='!')
            {
                sentences++;
            }
        }
        return sentences;
    }
}