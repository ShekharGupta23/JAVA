// Java Program to convert String to Long using parseLong() Method

public class StringToLong {

    public static void main(String args[]) {
        
        String s = "999999999999";
        System.out.println("String: " + s);

        long l = Long.parseLong(s);
        System.out.println("Long: " + l);
    }
}