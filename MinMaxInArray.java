public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {23, 10,20,30,40,50};
        int min = numbers[0];
        int max = numbers[0];
        for(int num : numbers){
            if(num < min ){
                min = num;
            }
        }
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Minimum : "+ min);
        System.out.println("Maximum: "+ max);
    }
    
}
