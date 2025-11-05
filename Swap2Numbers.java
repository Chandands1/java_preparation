import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the value of number2: ");
        int number2 = input.nextInt();
        System.out.println("Before Swap: "+ number1+ " "+ number2);
        swap(number1, number2);

    }
    public static void swap(int number1, int number2){
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After Swap: "+ number1+ " "+ number2);

    }
    
}
