import vehicle.Car;


class InvalidSpeed extends Exception{
    String str;

    InvalidSpeed(String str){
        super(str);
    }
}

class F1 extends Car{

    public F1(int x){
            super(x);
    }

    int maxSpeed = (int)1.5*speed;

    public void speedUp(){
        try{
            dummy.speedUp(3);
            if(speed >= maxSpeed){
                speed = maxSpeed;
                InvalidSpeed obj = new InvalidSpeed("Max Speed Limit reached");
                throw obj;
            }
            }
            catch(InvalidSpeed obj){
                System.out.println(obj);
            }
        }
    

    public void speedDown(){
        dummy.speedDown(4);
    }
}

class SUV extends Car{


    public SUV(int x){
        super(x);
    }

    public int maxSpeed = 3*speed;

    public void speedUp(){
        try{
            dummy.speedUp(2);
            if(speed >= maxSpeed){
                speed = maxSpeed;
                InvalidSpeed obj = new InvalidSpeed("Max Speed Limit reached");
                throw obj;
            }
            }
            catch(InvalidSpeed obj){
                System.out.println(obj);
            }
        }
    

    public void speedDown(){
        dummy.speedDown(3);
    }

}

class Driver{
    public static void main(String args[]){
        Car alto = new Car(50);
        F1 bmw = new F1(100);
        SUV duster = new SUV(80);

        //Car
        System.out.println("Speed of alto car is: "+ alto.getSpeed());
        alto.speedUp();
	alto.speedUp();
	alto.speedDown();
	System.out.println("Updated Speed of alto car is: "+ alto.getSpeed());


        //F1
        System.out.println("Speed of bmw F1 is: "+bmw.getSpeed());
        bmw.speedUp();
        bmw.speedUp();
        bmw.speedDown();
        System.out.println("Updated Speed of bmw F1 is: "+bmw.getSpeed());


        //SUV
        System.out.println("Speed of duster suv is: "+duster.getSpeed());
        duster.speedUp();
	duster.speedUp();
	duster.speedDown();
        System.out.println("Updated Speed of duster suv is: "+duster.getSpeed());
    }
}



