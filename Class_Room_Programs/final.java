class ImmutableClass{
    final int value;

    ImmutableClass( /*final int aValue*/){
        value = 69;
    }

    public int getValue(){
        
        return this.value;
    }
}

class Driver{
    public static void main(String[] args){

        ImmutableClass obj = new ImmutableClass();
        System.out.println(obj.getValue());
        ImmutableClass obj1 = new ImmutableClass();
        System.out.println(obj1.getValue());
    }
}
