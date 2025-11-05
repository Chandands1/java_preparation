import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int revNumber = 0;
          
        while (number !=0) {
            int digit = number %10;
            revNumber = revNumber * 10 + digit;
            number = number / 10;
            
        }
        if(originalNumber == revNumber){
            System.out.println("The number is Pallindrome "+ revNumber);
        }else{
            System.out.println("The number is not a Pallindrome "+ revNumber); 
        }
    }

    
}
