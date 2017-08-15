import java.io.*;

class Largest{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.print("Input first number--> ");
        a = Integer.parseInt(obj.readLine());
        System.out.print("Input second number--> ");
        b = Integer.parseInt(obj.readLine());
        System.out.print("Input thrid number--> ");
        c = Integer.parseInt(obj.readLine());
        
        if(a>b && a>c)
            System.out.println(a + " is the largest of all three.");
        else if(b>a && b>c)
            System.out.println(b + " is the largest of all three.");
        else if(c>a && c>b)
            System.out.println(c + " is the largest of all three.");
        else 
            System.out.println("Don't input equal numbers.");
        
     }
}
