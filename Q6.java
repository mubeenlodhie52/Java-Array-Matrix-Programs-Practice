//6. Sort an array (ascending order)
public class Q6 {
    public static void print_Array(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,2,7,4,9,0,8,1};

        int n = arr.length-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        print_Array(arr);
    }
}
