
class This{

    int data;

    This(int data){
        this.data = data;
    }

    void print(){
        System.out.println(this.data);
    }

}

class Driver{
    public static void main(String[] args){
        This obj = new This(345);
        obj.print();
    }
}
    
