public class SelectionSort {
    public static void sortS(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 2, 3};
        sortS(arr);
    }
}
