// Java Program to sort the elements of an array
// in Ascending Order using Arrays.sort() method
import java.util.Arrays;

public class SortArrayInAscendingOrder  {
  	public static void main(String[] args) {
      
        int[] arr = new int[] { -2, 0, 1, 3, -1, 2 };

        // use Arrays.sort() method to sort array
        // elements in ascending order
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}