import java.io.*;

class Second_largest{
    public static void main(String args[]){
        int a[] = {12,14,98,13,346,34,312,90,45,23};

        int max = a[0];
        int smax = -12312;
        for(int i=1 ; i<10; i++)
        {
            if(max < a[i])
            {
                smax = max;
                max = a[i];
            }
            else if(a[i] > smax)
                smax = a[i];
        }

        System.out.println("Second largest element is: " + smax);
    }
}

                

