public class FibinocciSeries {
    public static void main(String[] args) {
        int number = 1;
        if( number < 1){
            System.out.println("Enter the Valid Number ");
        }else {
            series(number);
            
        }
    }
    public static void series(int number){
        int a = 0, b = 1;
        System.out.print(a + " "+ b);
        for(int i = 2; i < number ; i++){
            int next = a + b;
            System.out.print(" "+ next);
            a = b; 
            b = next;

        }

    }
    
    
}
