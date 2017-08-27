import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{

        double number,sum = 0;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<10; i++)
        {
            System.out.print("Input number "+(i+1)+": ");
            number = Double.parseDouble(obj.readLine());
            sum += number;
        }
    
        System.out.println("\nSum is: "+sum);

    }

}
