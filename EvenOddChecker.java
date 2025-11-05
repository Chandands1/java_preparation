import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        System.out.println("Enter the number to check Even or Odd: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        checkEvenOrOdd(number);
    }
    public static void checkEvenOrOdd(int number){
        if(number%2 == 0){
            System.out.println("The number is Even!");
        }else{
            System.out.println("The number is Odd!");
        }
    }
    
}
