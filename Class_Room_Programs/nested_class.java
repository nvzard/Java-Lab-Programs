
class Outer{

    void outerMethod(){
        obj.innerMethod();
        InnerStatic.innerStaticMethod();
    }
    
    int x =57;
    static int s = 99;

    class Inner{
        
        int inner = 88;
        void innerMethod(){
            System.out.println("Inner method "+x);
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

        Outer obj = new Outer();

        obj.outerMethod();
    }
}

