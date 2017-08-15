import java.io.*;

class Fibo{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a=1, b=1,sum;
        System.out.println("Fibonnaci Series for starting 20 numbers is: ");
        System.out.print(a + "," +b +",");
        for(int i=0; i<18; i++)
        {
            sum = a+b;
            System.out.print(sum);
            if( i < 17)
                System.out.print(",");
            a = b;
            b = sum;
        } 
        System.out.println();
        
    }
}
