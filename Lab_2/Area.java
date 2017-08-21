import java.io.*;

class Rectangle{

    int len,wid,area;

    Rectangle(int x, int y){
        len = x;
        wid = y;
    }
    
    void display(){
        
        area = len*wid;
        System.out.println("Area of rectangle is: "+ area);
    }

}

class Square extends Rectangle{

    Square(int x){

        len = wid = x;
    }

    void display(){

        area = len*wid;
        System.out.println("Area of square is: "+ area);
    }

}

class Driver{

    public static void main(String[] args){

        Square rec = new Square(5);
        Square sq = new Square(4);
        rec.display();
        sq.display();
    }
}


