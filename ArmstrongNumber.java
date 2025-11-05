public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;  // You can change this number
        int original = number;
        int sum = 0;

        // Step 1: Find the number of digits
        int n = 0, temp = number;
        while (temp != 0) {
            temp = temp / 10;
            n++;
        }

        // Step 2: Calculate sum of digits raised to power n
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp = temp / 10;
        }

        // Step 3: Compare sum with original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
