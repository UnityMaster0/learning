/*
Although this a common algorithm,
it is import that you look up only what a bubble sort is
and try to engineer it yourself
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        // Print the original array
        System.out.println("Original array:");
        printArray(arr);
        
        // Perform bubble sort
        bubbleSort(arr);
        
        // Print the sorted array
        System.out.println("\nSorted array:");
        printArray(arr);
    }
    
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
