// Java program to demonstrate toString() Method Importing I/O classes
import java.io.*;

class ToStringEx {

    public static void main(String[] args)
    {
        // Creating a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
            = new StringBuilder("GeeksForGeeks");

        // Print and display the string
        // using standard toString() method
        System.out.println("String contains = "
                           + str.toString());
    }
}