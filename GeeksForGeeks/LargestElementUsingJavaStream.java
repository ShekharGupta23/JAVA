// Java Program to Find the Largest Element in Array using Java Stream
import java.util.Arrays; 

public class LargestElementUsingJavaStream
{
    public static void main(String[] args)
    {
        int arr[] = {20, 10, 20, 4, 100}; 
        
        // Java Stream and max to find the 
      	// max element in array
        int max = Arrays.stream(arr).max().getAsInt(); 
      
        System.out.println(max); 
    } 

}