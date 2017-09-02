/*
Create a vehicle class with 2 variables named as ignition type & engin type. Create constructor to init the value of ignition & engin type. Then create 2 inner classes engin & ignition which describe them.
Then create 2 methods in outer class which we use to create an object of inner classes. In the inner class named as engin, create var named as fuel type(petrol/diesel/gas). Create another var named as stroke_type(2stroke/4stroke). Create necessary constructor and method for engin class. In ignition class create variable named as ignition_classifier(wired/wireless). Create necessary constructors and methods for accepting value from the user. 

Write a main class to test all these classes.

*/

class Vehicle{
    

    String engin_type, ignition_type;

    Vehicle(String a, String b){
        engin_type = a;
        ignition_type = b;
    }
    
    Ignition objIgnition(String ign_class){
        Ignition ign = new Ignition(ign_class);

        return ign;
    }

    Engin objEngin(String ftype, String stype){
        Engin eng = new Engin(ftype, stype);

        return eng;
    }

    void print(String x){
        System.out.println(x);
    }

    class Ignition{
        String ign_classifier;

        Ignition(String ign){
            ign_classifier = ign;
        }

        void display_ignition(){
            print("Ignition classifier: " + ign_classifier);
        }
    
    }

    class Engin{

        String fuel_type;
        String stroke_type;
       
        Engin(String a, String b){
            fuel_type = a;
            stroke_type = b;
        }

        void display_engin(){
            print("Fuel type: "+ fuel_type);
            print("Stroke Type: "+ stroke_type);
        }
        
    }
}

