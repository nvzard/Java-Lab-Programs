class MV{
    String mname, mnumber;
    int mprice;
       
    MV(String mname, String mno, int mprice){
        this.mname = mname;
        this.mnumber = mno;
        this.mprice = mprice;
    }
    
    void display(){
        System.out.println("Model Name: "+mname);
        System.out.println("Model Number: "+mnumber);
        System.out.println("Model Price: "+mprice);
    }

}

class Car extends MV{

    int drate;

    Car(String mname, String mno, int mprice, int drate){
        super(mname, mno, mprice);
        this.drate = drate;
    }
    
    void discount(){

        double disc = (double)mprice - mprice*((double)drate/100);
        System.out.println("Discounted price is: "+disc);
    
    }
        void display(){             
            super.display();
            discount();
        }
    }




class Main{

    public static void main(String args[]){

        MV obj = new MV("Suzuko", "123",99980);

        Car bmw = new Car("BMW", "i8",1231231, 20 );
        obj.display();
        bmw.display();

    }
}
