import java.io.*;

class Rectangle{

    double length =0, width =0;

    void setLength(double len){
        if(len < 0 && len >20)
            return;
        length = len;
    }

    void setWidth(double wid){
        if(wid <0 && wid>20)
            return;
        width = wid;
    }

    double getPerimeter(){
        return 2*(length+width);
    }
    
    double getArea(){
        return length*width;
    }

}

class Driver{

    public static void main(String[] args){
        Rectangle obj = new Rectangle();

        obj.setLength(6);
        obj.setWidth(4);

        System.out.println("Perimeter is: "+obj.getPerimeter());
        System.out.println("Area is: "+obj.getArea());

    }
}
