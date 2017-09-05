
class Outer{

    void outerMethod(){
        obj.innerMethod();
        //System.out.println(inner);
        InnerStatic.innerStaticMethod();
        
    }
    
    private int x =57;

    static int s = 99;

    class Inner{
        
        private int ix = 999;
        int inner = 88;
        void innerMethod(){
            System.out.println("Inner method "+x +" "+ix );
        } 
        
    }

    static class InnerStatic{
                
        static void innerStaticMethod(){
            System.out.println(s);
        }

    }
    Inner obj = new Inner(); 

}


class Driver{

    public static void main(String[] args){

        Outer ob1 = new Outer();

        
        ob1.outerMethod();
        ob1.obj.innerMethod();
    }
}

