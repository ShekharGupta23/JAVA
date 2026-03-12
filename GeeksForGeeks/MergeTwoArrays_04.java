// Java program to demonstrate merging
// two array using ArrayList
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays_04 
{

    public static int[] mergeArraysUsingArrayList(int[] a, int[] b)
    {

        // Create an ArrayList to store the merged
        // elements
        List<Integer> l = new ArrayList<>();

        // Iterate through a and add each element to
        // resultList
        for (int n : a) {
            l.add(n);
        }

        // Iterate through b and add each element to
        // resultList
        for (int n : b) {
            l.add(n);
        }

        // Convert the ArrayList to an array using
        // streams
        return l.stream()
                .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args)
    {

        int arr1[] = { 10, 20, 30 };
        int arr2[] = { 40, 50, 60, 70, 80 };

        int[] ans = mergeArraysUsingArrayList(arr1, arr2);

        System.out.println("" + Arrays.toString(ans));
    }
}