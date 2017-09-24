package p3;

import p1.*;
import p2.*;

class M1{

    public static void main(String[] args){
        
        Normal_Calculator cal = new Normal_Calculator();
        Scientific_calculator scal = new Scientific_calculator();
       
        System.out.println("2 + 3 = "+cal.add(2,3));
        System.out.println("4 - 1 = "+cal.subtract(4,1));
        System.out.println("5 x 6 = "+scal.multiply(5,6));
        System.out.println("10 / 2 ="+scal.divide(10,2));

   }
}

