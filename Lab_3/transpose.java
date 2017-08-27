import java.io.*;


class Matrix{

    static void transpose(int matrix[][])
    {
        System.out.println("The transpose is:");
        for(int i=0; i<matrix.length ;i++){

            for(int j=0; j<matrix[i].length ;j++){

                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }

    }
             
    public static void main(String[] args){

        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        transpose(matrix);
    }

}
            
