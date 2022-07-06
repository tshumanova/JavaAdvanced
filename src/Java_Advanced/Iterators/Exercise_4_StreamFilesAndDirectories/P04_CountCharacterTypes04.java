package Java_Advanced.Iterators.Exercise_4_StreamFilesAndDirectories;

import java.io.*;

public class P04_CountCharacterTypes04 {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try (FileReader fr = new FileReader("src/Java_Advanced.Iterators.Resources_4_Exercise/input.txt");
            PrintWriter pw = new PrintWriter(new FileWriter("src/Java_Advanced.Iterators.Resources_4_Exercise/output.txt"))){

            int oneSymbol = (char) fr.read();
            while (oneSymbol >= 0) {
                char symbolAsChar = (char) oneSymbol;
                if (isVowel(symbolAsChar)) {
                    vowels++;
                } else if (isPunctuation(symbolAsChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar)) {
                    consonants++;
                }
                oneSymbol = fr.read();
            }
            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean isVowel(char character) {
        return character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i';
    }

    public static boolean isPunctuation(char character) {
        return character == '?' || character == '!' || character == '.' || character == ',';


    }
}
