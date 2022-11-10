
import java.util.Scanner; // Import the Scanner class to get user input

public class Main {
    static Scanner sc = new Scanner(System.in); // Create a Scanner object to write input

    public static void main(String[] args) {
        int arr_size;
        System.out.println("Enter the array size: ");
        arr_size = sc.nextInt();

        // Call input array, bubble sort array, output sorted array and binary search in array functions
        // Passes to function arguments input array and size array, also sorted array
        int[] arr = input_array(arr_size);
        int[] arr_sort = bubble_sort(arr, arr_size);
        output_arr(arr_sort, arr_size);
        binary_search(arr, arr_size);

    }

    public static int[] input_array(int size) { // This function reads entered array and write by counter
        int[] new_array = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; ++i) {
            new_array[i] = sc.nextInt();
        }
        return new_array;

    }

    public static int[] bubble_sort(int[] arr, int size) { // This function sorts array
        boolean sorted = false; // Array isn't sorted
        while (!sorted) { // Sort cycle
            sorted = true; // Until the array is sorted in ascending order
            for (int i = 0; i <  size - 1; ++i) { // Count to write sorted array

                if (arr[i] > arr[i+1]) { // Comparison of neighboring elements, if first bigger then next
                    int temp = arr[i]; // So first write to temporary variable
                    arr[i] = arr[i+1]; // And second to first
                    arr[i+1] = temp; // Elements change places
                    sorted = false;
                }
            }
        }
        return arr; // Return sorted array
    }

    public static void output_arr(int[] arr, int size) { // This function output sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; ++i) { // Without count array doesn't output
            System.out.println(arr[i]);
        }
    }

    public static void binary_search(int[] arr,int size) { // This function search elements in array by splitting
        System.out.println("Enter the number from array to find it's index : ");
        int key = sc.nextInt();
        int left = 0; // Left part of index array
        int right = size-1; // Right part of index array without last
        boolean found = false; // Index not found
        while(left <= right) { // Cycle search until lift part less or equal right
            int middle = (left + right)/2; // Middle index in array
            if(arr[middle] == key) { // If middle index is desired
                found = true; // Index was found
                System.out.println("Key found. Index: " + middle);
                break; // Stop search
                //If index not found, cut left or right part and returns to the previous step
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else if (arr[middle] > key) {
                right = middle - 1;
            }
        }
        if (!found) { // If index not found in array
            System.out.println("Key not found");
        }
    }
}