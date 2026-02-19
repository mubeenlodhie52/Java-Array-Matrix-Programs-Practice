//5. Search an element (linear search)
public class Q5 {
    public static void main(String[] args) {
        int array[] = {6,2,7,4,9,0,8,1};
        int x = 9;

        for(int i=0; i<array.length; i++){
            if(array[i] == x){
                System.out.println("Element fount at index: "+i);
            }
        }
    }
}
