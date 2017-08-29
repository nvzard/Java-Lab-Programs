/*
Write a program to calculate how much a 15k investment be worth if it is incremented in value by
- first_year: incremented in value by 20%
- second_year: decremented in value by 500Rs
- third_year: incremented in value by 16%
*/

import java.io.*;

class Finance{

    int investment = 15000;

    void first_year(){
        investment += (investment*20*1)/100;
    }

    void second_year(){
        investment -= 500;
    }

    void third_year(){
        investment += (investment*16*3)/100;
    }

    void display(){
        System.out.println("Your final value is: "+investment);
        System.out.println("Your profit/loss is : "+(investment-15000));
    }

}

class Driver{

    public static void main(String[] args){

        Finance obj = new Finance();
        obj.first_year();
        obj.second_year();
        obj.third_year();
        obj.display();

    }
}

    
