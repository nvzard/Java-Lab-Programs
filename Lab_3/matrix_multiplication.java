import java.io.*;


class Matrix{

    static void display(int matrix[][])
    {
        for(int i=0; i<matrix.length ;i++){

            for(int j=0; j<matrix[i].length ;j++){

                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

    static void multiply(int a[][], int b[][])
    {

        int[][] mult = new int[a.length][b[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b[i].length; j++){
                mult[i][j] = 0;
                for(int k=0; k<b.length; k++)
                {
                    mult[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        display(mult);
    }

             
    public static void main(String[] args){

        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int b[][] = {{9,8,7}, {6,5,4}, {3,2,1}};

        multiply(a,b);
    }

}
            
