import java.lang.Math;

class Series{

    void series_1(int n){
        double sum=0;
        for(int i=1; i<=n; i++)
            sum += 1/(double)i;
        

        System.out.println("Sum for "+n+" terms: "+sum);
    }

    void series_2(int n){
        double sum = 1;
        for(int i=1; i<n; i++)
        {
            if(n > 1){

            sum += 1/Math.pow(2,i);
            }else{
                sum = 1;
                break;
            }
        }
        
        System.out.println("Sum for "+n+" terms: "+sum);
        }

    int factorial(int n){
        int fact = 1;
        for(int i=n; i>0; i--)
            fact *=i;
        return fact;
    }

    void series_3(int n){
        double sum=1;
        for(int i=2; i<=n; i++){
            if(n >1)
                sum += (double)i/(double)factorial(i-1);
            else{
                sum = 1;
                break;
            }
        }
                

        System.out.println("Sum of "+n+" terms: "+sum);
    }

}

class Driver{
    public static void main(String[] args){
        
        Series obj =new Series();

        obj.series_1(4);
        obj.series_2(4);
        obj.series_3(4); 
    }

}

















