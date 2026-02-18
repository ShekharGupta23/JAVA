// Java program to Illustrate Calling of a Non-Static Method

// Class 1
// Helper class
class Helper {

    // Non-static method
    public int sum(int a, int b)
    {
        return a + b;
    }
}

// Class 2
// Main class
class NonStaticMethod {

    public static void main(String[] args)
    {
        int n = 3, m = 6;

        // Creating object of above class
        Helper g = new Helper();

        // Calling above method to compute sum
        int s = g.sum(n, m);

        // Calling the non-static method
        System.out.print("sum is = " + s);
    }
}