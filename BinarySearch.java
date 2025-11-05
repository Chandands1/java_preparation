public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;

        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (numbers[mid] < key) {
                low = mid + 1;  // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
