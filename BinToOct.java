// Java program to convert binary to octal using user-defined function

class BinToOct {
    int binaryToDecimal(long binary)
    {
        int decimalNumber = 0, i = 0;
        while (binary > 0) {

            decimalNumber
                += Math.pow(2, i++) * (binary % 10);

            binary /= 10;
        }

        return decimalNumber;
    }

    int decimalToOctal(long binary)
    {
        int octalNumber = 0, i = 0;

        int decimalNumber = binaryToDecimal(binary);

        while (decimalNumber != 0) {

            octalNumber += (decimalNumber % 8)
                           * ((int)Math.pow(10, i++));

            decimalNumber /= 8;
        }

        return octalNumber;
    }

    public static void main(String[] args)
    {
        BinToOct ob = new BinToOct();

        System.out.println(ob.decimalToOctal(1001001));
    }
}