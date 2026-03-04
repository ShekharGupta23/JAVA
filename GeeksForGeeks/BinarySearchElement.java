// Java program to check if an element is present using Binary Search
import java.util.Arrays;

class BinarySearchElement {
    private static boolean isElementPresent(int[] arr, int key) {
        Arrays.sort(arr); // Binary search works only on sorted arrays
        int res = Arrays.binarySearch(arr, key);
        return res >= 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 6, 10};
        int key = 17;

        boolean res = isElementPresent(arr, key);
        System.out.println("Is " + key + " present in the array: " + res);
    }
}