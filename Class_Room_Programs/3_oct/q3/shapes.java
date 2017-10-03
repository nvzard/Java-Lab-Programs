
interface Shape{

    void no_of_sides();
}

class Trapezoid implements Shape{

    final int sides;

    Trapezoid(int s){
        this.sides = s;
    }

    public void no_of_sides(){
        System.out.println("No. of sides are: "+sides);
    }

}

class Triangle implements Shape{

    final int sides;

    Triangle(int s){
        this.sides = s;
    }

    public void no_of_sides(){
        System.out.println("No. of sides are: "+sides);
    }

}

class Hexagon implements Shape{

    final int sides;

    Hexagon(int s){
        this.sides = s;
    }

    public void no_of_sides(){
        System.out.println("No. of sides are: "+sides);
    }

}

class Driver{
    public static void main(String[] args){

    Trapezoid trap = new Trapezoid(4);
    Triangle tri = new Triangle(3);
    Hexagon hex = new Hexagon(6);

    trap.no_of_sides();
    tri.no_of_sides();
    hex.no_of_sides();

    }
}

    
