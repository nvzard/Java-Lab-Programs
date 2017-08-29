import java.io.*;

class Circle{
    final double pi =22/7;
    double radius;

    void setRadius(double r){
        radius = r;
    }

    double calculateArea(){
        return pi*radius*radius;
    }

    double circleCircumference(double r){
        return 2*pi*r;
    }

    double arcLength(double ang){
        return (2*pi*radius*ang)/360;
    }
}

class Driver{
    
    public static void main(String[] args){
        Circle obj = new Circle();
        obj.setRadius(10.956);
        System.out.println("Circumference: "+ obj.circleCircumference(10));
        System.out.println("Area of radi 10.956: "+obj.calculateArea());
        System.out.println("Arc length of 45 degree: "+ obj.arcLength(45));

    }
}
