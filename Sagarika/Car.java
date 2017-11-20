package vehicle;

public class Car{

    public Car(int x){
        speed = x;
    }

    public int speed;
    public Engine dummy = new Engine();
    public void speedUp(){
        dummy.speedUp(1);
    }

    public void speedDown(){
        dummy.speedDown(1);
    }

    public int getSpeed(){
        return speed;
    }

    public class Engine{

        public void speedUp(int x){
            speed += x;
        }

        public void speedDown(int x){
            speed -= x;
        }
        
        public int getRPM(){
            return speed;
        }
    }
}
