import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial: ");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int factorial = 1;
        while(number != 0){
            factorial = factorial * number;
            number--;
        }
        System.out.println(factorial);
    }
    
}
