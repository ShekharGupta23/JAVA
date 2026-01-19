// Java program to find compound interest for given values.

import java.io.*;
class CompoundInterest
{
    public static void main(String args[])
    {
        double principal = 10000, rate = 10.50, time = 10;

        double CI = principal *
                    (Math.pow((1 + rate / 100), time));
        
        System.out.println("Compound Interest is "+ CI);
    }
}