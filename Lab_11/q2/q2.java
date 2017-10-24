class Display{
    
    void disp(){
        System.out.println("No Parameter(Default)");
    }

    public void disp(int a){
        System.out.println("One Parameter(Public)");
    }

    protected void disp(int a, int b){
        System.out.println("Two Parameters(Protected)");
        disp(1,1,1);
    }

    private void disp(int a, int b, int c){
        System.out.println("Three Parameters(Private)");
    }

}

class Driver{
    public static void main(String args[]){

        Display obj = new Display();

        obj.disp();
        obj.disp(1);
        obj.disp(1,2);
//        obj.disp(1,2,3);

    }
}



