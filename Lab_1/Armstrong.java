import java.io.*;

class Armstrong{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int n, temp, sum=0;
        System.out.print("Input a number--> ");
        n = Integer.parseInt(obj.readLine());
        temp = n;
        while(temp > 0){
            sum = sum + (temp%10)*(temp%10)*(temp%10);
            temp /= 10;
        }
        if( n == sum)
            System.out.println(n + " is an armstrong number.");
        else
            System.out.println(n + " is not an armstrong number.");
    }
}
