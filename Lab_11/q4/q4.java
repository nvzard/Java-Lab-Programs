class A{
    static void disp(){
        System.out.println("Hello");
    }

}

class B extends A{
    static void disp(){
        System.out.println("Hi!");
    }

}

class Driver{
    public static void main(String args[]){

        A obj = new B();
        obj.disp();
    }

}
