// Java program to demonstrate toString() Method. Importing input output classes
import java.io.*;

// Main class
class ToStringEx_02 {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a StringBuilder object with
        // a String pass as parameter
        StringBuilder str = new StringBuilder(
            "Geeks for Geeks contribute");

        // Print and display the string
        // using toString() method
        System.out.println("String contains = "
                           + str.toString());
    }
}