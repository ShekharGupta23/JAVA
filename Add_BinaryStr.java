// Java program to add two binary strings

import java.util.Scanner;
public class Add_BinaryStr {

    static String add_Binary(String x, String y)
    {

        int num1 = Integer.parseInt(x, 2);

        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;
  
        String result = Integer.toBinaryString(sum);
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String x = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String y = sc.nextLine();

        System.out.print(add_Binary(x, y));
    }
}
