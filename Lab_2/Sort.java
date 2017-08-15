import java.io.*;

class Sort{
    public static void main(String args[]){
        int a[] = {5,3,6,45,21,64,23,64,42,53};
        System.out.println("Shuffled array is:");
        for(int i=0; i<10; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nSorted array is:");
        
        int temp;

        for(int i=0; i<10; i++)
        {
            for(int j=i+1; j<10; j++)
            {
                if(a[i] > a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
            }
        }
        
        for(int i=0; i<10; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }
}
                    

