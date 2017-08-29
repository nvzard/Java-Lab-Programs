/*Write a program to o binary to decimal and decimal to binary conversions*/

import java.io.*;

class Conversion{

    static void bin_to_dec(int bin){
        int dec=0;
        int i=0;

        
        while(bin > 0){
            dec += Math.pow(2,i)*(bin%10);
            bin /= 10;
            i++;
        }

        System.out.println("The binary value is: "+dec);
    }



}

class Driver{
    public static void main(String[] args){

        Conversion obj = new Conversion();

        obj.bin_to_dec(11000);

    }
}
