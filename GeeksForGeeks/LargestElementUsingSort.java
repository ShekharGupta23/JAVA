// Java Program to find the largest element in the array using sort function
import java.io.*;
import java.util.*;

class LargestElementUsingSort
{
    public static void main(String[] args)
    {
      	// Array created      
        int arr[] = {20, 10, 20, 4, 100};
          
        // Sorting function using sort function
        Arrays.sort(arr);
      
        System.out.println(arr[arr.length - 1]);
    }
}