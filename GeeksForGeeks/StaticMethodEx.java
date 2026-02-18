// Java program to Illustrate Calling of a Static Method

// Class 1
// Helper class
class Helper {

    // Static method
    public static int sum(int a, int b)
    {
        return a + b;
    }
}

class StaticMethodEx {

    public static void main(String[] args)
    {
        int n = 3, m = 6;

        int s = Helper.sum(n, m);

        System.out.print("sum is = " + s);
    }
}