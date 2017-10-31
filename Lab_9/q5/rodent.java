
interface Rodent{
    void display();
    
}

class Mouse implements Rodent{

    public void display(){
        System.out.println("Mouse Display");
    }
}

class Garvil implements Rodent{

    public void display(){
        System.out.println("Garvil Dispaly");
    }
}

class Hamster implements Rodent{

    public void display(){
        System.out.println("Hamster Display");
    }
}

class Driver{
    public static void main(String[] args){

        Rodent arr[] = new Rodent[3];
        arr[0] = new Mouse();
        arr[1] = new Garvil();
        arr[2] = new Hamster();

        arr[0].display();
        arr[1].display();
        arr[2].display();
    }
}

















