interface cc{
    int bal=999;
    void disp();
    void show();
}

class Deutsche implements cc{

    Deutsche(int x){
        bal = x;
    }

    void disp(){
        System.out.println(bal);
    }

    void show(){
        disp();
    }

}

class SBI implements cc{

    SBI(int z){
        bal = z;
    }

    void disp(){
        System.out.println(bal);
    }

    void show(){
        disp();
    }

}

class Driver{
    public static void main(String[] args){

        cc ref;
        Deutsche obj = new Deutsche(55);

        ref = obj;
        ref.show();

        SBI obj1 = new SBI(55);

        ref = obj1;

        ref.show();

        cc ref = new Deutsche(550);
        ref.show();

    }
}
        






















