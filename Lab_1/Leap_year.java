import java.io.*;

class Leap_year{
    public static void main(String args[]) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int year;
        System.out.print("Input an year--> ");
        year = Integer.parseInt(obj.readLine());
        
        if(year % 400 == 0)
            System.out.println(year+" is a leap year.");
        else if(year % 100 == 0)
            System.out.println(year+" is not a leap year.");
        else if(year % 4 == 0)
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is not a leap year.");
    }
}
