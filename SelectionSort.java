public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume current is smallest

            // find index of smallest element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap smallest element with first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
