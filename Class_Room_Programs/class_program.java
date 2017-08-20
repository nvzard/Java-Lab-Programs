import java.io.*;

class Fact
{
    
    public void print(int x)
    {
        System.out.println("This is int method " + x );
    }

    public void print(String x)
    {
        System.out.println("This is string method " + x);
    }

}


class Main
{
    public static void main(String argv[])
    {
        Fact obj = new Fact();
        obj.print("Nigga");

    }
}
