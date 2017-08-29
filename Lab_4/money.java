import java.io.*;

class Money{

    double money=0;

    Money(double r, double p){
        money += r;
        money += p/100;
    }

    void add(double r, double p){
        money += r;
        money += p/100;
    }

    void subtract(double r, double p){
        money -= r;
        money -= p/100;
    }

    void display(){
        System.out.println("Money is "+ money);
    }
}

class Driver{
    public static void main(String[] args){
        Money acc = new Money(50, 389);

        acc.add(5, 49);
        acc.subtract(2, 26);
        acc.display();
    }
}
