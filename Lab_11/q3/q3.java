class Calculator{

    int a,b;

    void calci(int a,int b){
        
        System.out.println("Non static sum: "+ (a+b));
    }


    static void calci(double a, double b){

        System.out.println("Static sum: "+(a+b));
    }

}

class Driver{

    public static void main(String args[]){

        Calculator obj = new Calculator();
        
        obj.calci(1,2);
        obj.calci(1.1,2.2);    
    

    }
}
