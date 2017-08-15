import java.io.*;

class Factorial{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int n, i, fact=1;
        System.out.print("Input a number--> ");
        n = Integer.parseInt(obj.readLine());
        for(i=1; i<=n; i++)
            fact = fact*i;

        System.out.println("Its factorial is " + fact);
    }
}
