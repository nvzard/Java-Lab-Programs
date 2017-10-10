class Driver{

    public static void main(String args[]){

        int array[][] = { {1,2,3} , {1,2}, {1,2,3,4}};

        int sum = 0;

        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++)
                sum += array[i][j];

        System.out.println("Sum is: "+sum);

    }

}
