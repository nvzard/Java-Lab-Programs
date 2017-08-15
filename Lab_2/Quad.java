import java.io.*;
import java.lang.Math;

class Quad{
    public static void main(String args[]) throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c,d,x1,x2;
        System.out.print("Input value of a-->");
        a = Double.parseDouble(obj.readLine());
        System.out.print("Input value of b-->");
        b = Double.parseDouble(obj.readLine());
        System.out.print("Input value of c-->");
        c = Double.parseDouble(obj.readLine());
        d = (b*b) - (4*a*c);
        if( d < 0)
        {
            System.out.println("There are no real solution");
            System.exit(0);
        }

        x1 = (-b + Math.sqrt(d))/(2*a);
        x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("Roots of equation are " + x1 + " and " + x2);
    }
}

