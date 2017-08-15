import java.io.*;

class Palindrome{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int n, temp, rev=0;
        System.out.print("Input a number--> ");
        n = Integer.parseInt(obj.readLine());
        temp = n;
        while(temp > 0){
            rev = (rev*10) + (temp%10);
            temp /= 10;
        }
        if( n == rev)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}
