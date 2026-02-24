// Java program demonstrate IndexOutOfBoundsException thrown by the codePointAt() Method.

class CodePointAtEx_02 {
    public static void main(String[] args)
    {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer
            str
            = new StringBuffer("GeeksForGeeks Contribute");

        try {

            // get char at position 25 which is
            // greater then length
            int i = str.codePointAt(25);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}