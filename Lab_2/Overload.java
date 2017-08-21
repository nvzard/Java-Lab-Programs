import java.io.*;

class Rectangle{
    
    int x,y;

    Rectangle(int width){
        x = y =width;
    }
    
    Rectangle(int width, int breadth){
        x = width;
        y = breadth;
    }

    void area(){
        System.out.println("Area of rectangle is: "+ x*y);
    }


}



class Driver{

    public static void main(String[] args){

    
    Rectangle sq = new Rectangle(5);
    Rectangle rec = new Rectangle(8,4);
    
    sq.area();
    rec.area();

    }
}
