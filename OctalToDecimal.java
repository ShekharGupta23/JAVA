// Java program to convert octal number to decimal using
// Integer.parseInt()
public class OctalToDecimal
{
    public static void main(String args[])
    {

        String oct = "157";

        int num = Integer.parseInt(oct, 8);

        System.out.println(
            "Decimal equivalent of Octal value of 157 is: "
            + num);
    }
}