public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,45,50,60};
        int key = 45;
        boolean isfound = false;

        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == key){
                System.out.println("Element found at index: " + i);
                isfound = true;
                break;
            }
            }
            if(isfound == false){
                System.out.println("Element not in the array");
            }
        }
    
    
}
