//Find largest and smallest element in an array
public class Q1 {
    public static void main(String[] args) {
        int array[] = {5,2,9,1,4};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
