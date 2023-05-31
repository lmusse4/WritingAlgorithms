import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {4, 1, 3, 9, 7};
        int n1 = arr1.length;
        bubbleSort(arr1, n1);
        System.out.println("Sorted array (Example 1): " + Arrays.toString(arr1));

        // Example 2
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n2 = arr2.length;
        bubbleSort(arr2, n2);
        System.out.println("Sorted array (Example 2): " + Arrays.toString(arr2));
    }
}
