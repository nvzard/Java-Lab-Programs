class ImmutableClass{
    final int value;

    ImmutableClass(final int aValue){
        this.value = aValue;
    }

    public int getValue(){
        
        return this.value;
    }
}

class Driver{
    public static void main(String[] args){

        ImmutableClass obj = new ImmutableClass(12);
        System.out.println(obj.getValue());
        obj = new ImmutableClass(44);
        System.out.println(obj.getValue());
    }
}
