//9. Find transpose of matrix
public class Q9 {
    public static void main(String[] args) {
        int matrix [][] = {
            {1,2,3},
            {4,5,6}
        };


        int transpose [][] = new int[3][2];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
