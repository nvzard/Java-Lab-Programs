import java.io.*;
import java.util.*;

class Rand{

    public static void main(String[] args){

        Random obj = new Random();

        int n=10,sum=0,rand;

        for(int i=0; i<n; i++){
            rand = obj.nextInt(10) + 1;
            sum += rand;
            System.out.println("The number is: "+ rand);
            System.out.print("Start Pattern: ");
            for(int j=0; j<rand; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("\nSum is : "+sum);
        System.out.println("Average is: "+(sum/n));
    }
}
