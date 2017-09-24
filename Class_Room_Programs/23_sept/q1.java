class MV{
    String mname;
    



    void display(){
        System.out.println("MV");

    }

}

class Car extends MV{

    void display(){

        
        System.out.println("Car");
        super.display();

    }

}


class Main{

    public static void main(String args[]){

        Car obj = new Car();
        obj.display();

    }
}
