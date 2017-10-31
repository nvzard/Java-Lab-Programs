class A{

    void v1(){
        System.out.println("Hello");
    }

}

class B extends A{

    void v1(){
        System.out.println("Hi");
    }
}

class Driver{
    public static void main(String[] args){

        A obj;
        obj = new B();
        
        obj.v1();
        obj.v2();
    }
}
