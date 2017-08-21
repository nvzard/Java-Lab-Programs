import java.io.*;

class Array{

    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    int[][] readArray(int row, int col)throws IOException{

        int nigga[][] = new int[row][col];
        System.out.println("Input Values in array:");
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                {
                    nigga[i][j] = Integer.parseInt(obj.readLine());
                }

        return nigga;     
    }
    
    int[][] multArray(int[][] array, int row, int col){
        int 
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                sum += array[i][j];

        return sum;
    }


}


class Driver{

    public static void main(String[] args)throws IOException{

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int ROWS, COL;
        System.out.println("Input size of matrix.");
        System.out.print("Rows: ");
        ROWS = Integer.parseInt(obj.readLine());
        System.out.print("Columns: ");
        COL = Integer.parseInt(obj.readLine());
        
        int[][] array = new int[ROWS][COL];
    
        Array ar1 = new Array();
        array = ar1.readArray(ROWS,COL);
        int sum = ar1.sumArray(array,ROWS,COL);
        System.out.println("Sum of array is: "+sum);
    }
}
    
