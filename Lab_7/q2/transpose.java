import java.lang.*;

class Transpose{

    static int[][] transpose(int matrix[][]){

        int m = matrix.length;
        int n = matrix[0].length;

        int trans[][] = new int[n][m];

        for(int i=0; i<n*m; i++)
                System.arraycopy(matrix[i],index, trans[i],inde:x, 1);

        return trans;
    }

    static void print(int matrix[][]){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}

class Main{
    public static void main(String args[]){

        Transpose obj = new Transpose();

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        obj.print(matrix);
        matrix = obj.transpose(matrix);
        obj.print(matrix);
    }
}
