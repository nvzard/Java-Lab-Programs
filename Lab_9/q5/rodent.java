
interface Rodent{
    void display();
    String[] rodents = {"Mouse", "Garvil", "Hamster"};
}

class Mouse implements Rodent{

    public void display(){
        System.out.println("Mouse Display");
    }

    public void show(){
        display();
        System.out.println(rodents[0] +" Show");
    }

}


class Garvil implements Rodent{

    public void display(){
        System.out.println("Garvil Dispaly");
    }

    public void show(){
        display();
        System.out.println(rodents[1] +" Show");
    }

}

class Hamster implements Rodent{

    public void display(){
        System.out.println("Hamster Display");
    }

    public void show(){
        display();
        System.out.println(rodents[2]+" Show");
    }
}

class Driver{
    public static void main(String[] args){

        Mouse mouse = new Mouse();
        Garvil garvil = new Garvil();
        Hamster hamster = new Hamster();
        
        mouse.show();
        garvil.show();
        hamster.show();
    }
}

















