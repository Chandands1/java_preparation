import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check Prime: ");
        int number =  input.nextInt();
        if(number < 2){
            System.out.println("Not prime Number!");
        }else{
             primeNumber(number);
        }
       

    }
    public static void primeNumber(int number){
        int value = 0;
        for(int i =1; i<= number; i++){
            if( number % i == 0){
                value++;
            }

        }
        if(value == 2){
            System.out.println("The number is Prime Number!");
        }else{
            System.out.println("The number is not a prime number");
        }
    }
    
}
