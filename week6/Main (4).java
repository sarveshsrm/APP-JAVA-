package sorting;
public class BubbleSort054 {
    public static void sort(int[] arr) {
    }
}
package sorting;
public class SelectionSort054 {
    public static void sort(int[] arr) {
    }
}
import sorting.BubbleSort054;
import sorting.SelectionSort054;
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nOriginal Array:");
        printArray054(arr);
        BubbleSort054.sort(arr);
        System.out.println("\nSorted using BubbleSort:");
        printArray054(arr);
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        SelectionSort054.sort(arr2);
        System.out.println("\nSorted using SelectionSort:");
        printArray054(arr2);
    }
    private static void printArray054(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
