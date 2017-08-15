import java.io.*;

class Rectangle{
    int len,wid, area;
    
    Rectangle(int a, int b){
        len = a;
        wid = b;
    }

    void area_rectangle(){
        area = len*wid;
        System.out.println("Area is: "+area);
    }

}

class Square extends Rectangle{


    Square(int side)
    {
        len = side;
        area = len*len;
    }

    void area_square(){
        System.out.println("Area is: "+area);
    }

}

class Overload{
    public static void main(String args[])
    {
        Square rec = new Rectangle(2,2);
        Square sq = new Square(4);

        sq.area_square();
    }

}
