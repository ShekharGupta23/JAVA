// Java program to check whether input character is a vowel or consonant
import java.io.*;

public class VowelConsonant {
    public static void main(String args[]) {
        char ch = 'p';
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+" is a consonant");
      }
    }
}