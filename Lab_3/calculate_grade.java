import java.io.*;

class Student{

    double physics, chemistry, maths;
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setMaths(double m){
        this.maths = m;
    }

    void setPhysics(double p){
        this.physics = p;
    }

    void setChemistry(double c){
        this.chemistry = c;
    }

    void grade()
    {
        double avg = (physics+chemistry+maths)/3;

        if(avg >= 90)
            print("Grade is A++");
        else if(avg >= 80 && avg<90)
            print("Grade is A+");
        else if(avg >= 70 && avg<80)
            print("Grade is A");
        else if(avg >= 60 && avg<70)
            print("Grade is B++");
        else if(avg >= 50 && avg<60)
            print("Grade is B+");
        else if(avg >= 40 && avg<50)
            print("Grade is B");
        else if(avg >= 35 && avg<40)
            print("Grade is C");
        else if(avg < 35)
            print("Grade is F");
        
    }

    void print(String text){
        System.out.println(text);
    }

}

class Driver{
    
    public static void main(String[] args){
    
        Student greg = new Student("Greg", 20);
        
        greg.setPhysics(70);
        greg.setChemistry(85);
        greg.setMaths(60);
        greg.grade();

    }
}




