public class ReverseANumber {
    public static void main(String[] args) {
        int number = 12345;
        int originalNumber = number;
        int revNumber = 0;
        while(number != 0){
            int digit = number % 10;
            revNumber = revNumber * 10 + digit;
            number = number / 10;

            
        }
        System.out.println(revNumber);
    }
    
}
