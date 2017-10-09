import java.lang.Math;

interface infaceA{
    double mean(int[] array);
}

interface infaceB extends infaceA{
    void deviation(int[] array);
}

class Stats implements infaceB{

    public double mean(int[] array){

        double sum = 0;
        for(int i=0; i<array.length; i++)
            sum += array[i];

        double mean = sum/array.length;
        System.out.println("Mean is: "+mean);
        
        return mean;
    }

    public void deviation(int[] array){

        double[] dev = new double[array.length];
        double sum=0;
        double mean = mean(array);
        for(int i=0; i<dev.length; i++){
            dev[i] = Math.abs(array[i]-mean);
            sum += dev[i];
        }
    
        double mdev = sum/array.length;
        
        System.out.println("Mean Deviation is: "+mdev);
    }
}

class Driver{
        public static void main(String[] args){

            int data[] = {3,6,6,7,8,11,15,16};

            Stats obj = new Stats();
            obj.deviation(data);

        }
}


