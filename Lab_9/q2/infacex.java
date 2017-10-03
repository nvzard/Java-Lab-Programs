interface Infacex{
    int number = 123;
    void reverse();
}


class A1 implements Infacex{

    
    public void reverse(){

        int rev = 0;

        int temp = number;

        while(temp != 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }

        System.out.println("Reverse is: "+rev);
    }

}

class Driver{
    public static void main(String[] args){

        A1 obj = new A1();
        obj.reverse();

    }
}
