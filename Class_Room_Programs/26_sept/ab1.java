abstract class Elect_bill{

    abstract void get_rate();
    abstract void calculate_bill(int units);
    double rate; 

}

class domestic extends Elect_bill{

    domestic(double rate){
        this.rate = rate;
    }
    void get_rate(){
        System.out.println("Domestic Rate is: "+rate);
    }

    void calculate_bill(int units){

    get_rate();
    System.out.println("Domestic bill is: "+ units*rate);

    }
}

class commercial extends Elect_bill{

    commercial(double rate){
        this.rate = rate;
    }


    void get_rate(){
        System.out.println("Commercial Rate is: "+rate);
    }

    void calculate_bill(int units){
        get_rate();
        System.out.println("Commercial bill is: "+units*rate);
    }


}


class Main{

    public static void main(String[] args){

        Elect_bill ref;     //Dynamic dispatch method //reference object 
        domestic dom = new domestic(5.25);
        commercial com = new commercial(10.50);
        
        ref =  dom;
        ref.calculate_bill(50);

        ref = com;
        ref.calculate_bill(50);


    }

}
