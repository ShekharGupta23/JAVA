// Java Program to find the maximum element
// in an Array using Collections.max() method
import java.util.*;

public class MaxElementInArray
{
    public static void main(String[] args)
    {      
        // Declaring array
        int arr[] = {20, 10, 20, 4, 100};

        // Creating new list
        List<Integer> list = new ArrayList<>();
      
        // Adding elements in list
        for (int i = 0; i < arr.length; i++) 
            list.add(arr[i]);

        // Using the method to find the
        // maximum element
        System.out.println(Collections.max(list));
    }
}