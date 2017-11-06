class InvalidRange extends Exception{
    String str;

    InvalidRange(String str){
        super(str);
    }
}

class CheckArgument extends Exception{
    String str;

    CheckArgument(String str){
        super(str);
    }
}

class Student{
    String name;

    Student(String name){
	this.name = name;
    }

    void inputMarks(int...marks){
        int sum = 0;

        try{

            if(marks.length != 5){
                CheckArgument arg = new CheckArgument("Only 5 arguments are allowed");
                throw arg;
            }
        

            for(int mark : marks){
                if(mark < 0 || mark > 50){
                    InvalidRange range = new InvalidRange("Range should be b/w 0-50");
                 throw range;
                }else
                    sum += mark;
            }

            total(sum);
        }
        catch(CheckArgument arg){
            System.out.println(arg);
        }
        catch(InvalidRange range){
            System.out.println(range);
        }

    }
    
    void total(int sum){        
        System.out.println("Total is: "+sum+" marks");
        System.out.println("Percentage: "+ (sum*100)/(double)250 + "%");
        System.out.println("Keep hustling "+name);
    }

}

class Driver{
    public static void main(String args[]){

        Student st = new Student("Ram Dayal");
        st.inputMarks(45,36,43,12,23);

    }
}
