import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator(); 
        System.out.println("Select the openration: 1=Addition, 2=Substraction, 3=Multiplication, 4=Division");
        
        Scanner input = new Scanner(System.in);
        int openration = input.nextInt();
        if(openration == 1){
             System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        sum(number1, number2);
            
        }else if(openration == 2){
            System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        sub(number1, number2);
        }else if(openration == 3){
           System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        mul(number1, number2);
        }else if(openration == 4){
        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();
        div(number1, number2);

        }else{
            System.out.println("Invalid Operation");
        }
        
        
    }
    public static void sum(int number1,int number2){
      long  sum = number1 + number2;
      System.out.println("The sum of "+ number1+ " and "+number2 + " is " + sum);

    }
    public static void sub(int number1, int number2){
        long sub = number1 - number2;
        System.out.println("The sub of "+ number1+ " and "+number2 + " is " + sub );
    }
    public static void mul(int number1, int number2){
        long multiplication = number1 * number2;
        System.out.println("The sub of "+ number1+ " and "+number2 + " is " + multiplication );
    }
    public static void div(int number1, int number2){
        double division = number1 / number2;
        System.out.println("The sub of "+ number1+ " and "+number2 + " is " + division );
    }
    
}