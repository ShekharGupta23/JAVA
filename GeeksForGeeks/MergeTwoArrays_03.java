// Java program to demonstrate merging
// two array using Java Stream
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays_03
{
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = {40, 50, 60, 70, 80};

        // Merging arrays using Java Streams
        int[] ans  = mergeArraysUsingStreams(arr1, arr2);

        System.out.println("" + Arrays.toString(ans));
    }

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {

        // Using Java Stream
        return IntStream.concat(Arrays.stream(arr1), 
        Arrays.stream(arr2)).toArray();
    }
}