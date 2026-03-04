// Java program to check if an element is present using List.contains()
import java.util.Arrays;

class ListContainsExample {
    private static boolean isElementPresent(Integer[] arr, int key) {
        return Arrays.asList(arr).contains(key);
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 7, 2, 6, 10};
        int key = 7;

        boolean res = isElementPresent(arr, key);
        System.out.println("Is " + key + " present in the array: " + res);
    }
}