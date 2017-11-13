import java.util.*;

class Dog{
    int size = 10;
    int mood = 1;
    //1 = normal
    //2 = irritated
    //3 = angry
    static int bark_count = 0;

    void setSize(int size){
        this.size = size;
    }

    void setMood(int mood){
        this.mood = mood;
    }

    int getSize(){
        return this.size;
    }

    int getMood(){
        return this.mood;
    }

    void moodChecker(){
        if(mood == 1 && bark_count == 3)
            setMood(2);
        else if(mood == 2 && bark_count == 6)
            setMood(3);
    }

    void bark(){
        if(size > 90){
            System.out.println("Woof...Woof");
            bark_count++;
            moodChecker();
            return;
        }else if(size > 50){
            System.out.println("Ruff...ruff");
            bark_count++;
            moodChecker();
            return;
        }else
            bark_count++;
            moodChecker();
            System.out.println("Yip...yip");
            
    }
}

class Pug extends Dog{

    void bark(){

        if(getMood() == 3){
            System.out.println("Grrr....Grrr");
        }

        if(bark_count > 4)
            System.out.println("BITE");

        if(size > 90){
            System.out.println("Woof...Woof");
            bark_count++;
            moodChecker();
            return;
        }else if(size > 50){
            System.out.println("Ruff...ruff");
            bark_count++;
            moodChecker();
            return;
        }else
            bark_count++;
            moodChecker();
            System.out.println("Yip...yip");
            
    }
}

class Driver{

    public static void main(String[] args){

    Vector<Dog> d = new Vector<Dog>(5);
    d.addElement(new Dog());
    d.addElement(new Dog());
    d.addElement(new Dog());
    d.addElement(new Dog());
    d.addElement(new Dog());

    Vector<Pug> p = new Vector<Pug>(5);
    p.addElement(new Pug());
    p.addElement(new Pug());
    p.addElement(new Pug());
    p.addElement(new Pug());
    p.addElement(new Pug());

    Dog dollar = new Dog();
    Pug baby = new Pug();

    System.out.println("Mood is: "+dollar.getMood());
    dollar.bark();
    dollar.bark();
    dollar.bark();
    
    dollar.bark();
    System.out.println("Mood is: "+dollar.getMood());
    dollar.bark();    
}
}







