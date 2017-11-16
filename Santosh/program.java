import myemp.Employee;

interface RevisedSalary{
    double Rsal(double percentage);
}

class NoRevision extends Exception{
    String str;

    NoRevision(String str){
        super(str);
    }
}

class ProjectManager extends Employee implements RevisedSalary{
    
    int Totalprojects, Totalbugsfixed;

    ProjectManager(String name, double salary, int totalproj, int totalbugs){
        this.full_name = name;
        this.salary = salary;
        this.Totalprojects = totalproj;
	this.Totalbugsfixed = totalbugs;
    }

    public double Rsal(double percentage){    
        this.salary += this.salary*(percentage/100);

        return salary;
    }
    void increment(){

     try{
        if(Totalbugsfixed < 20){
            NoRevision obj = new NoRevision("Totalbugsfixed are less than 20");
            throw obj;
        }

        if(Totalbugsfixed == 20)
            this.salary  = Rsal(10);
        else if(Totalbugsfixed == 30)
            this.salary = Rsal(20);
        else if(Totalbugsfixed > 30)
            this.salary = Rsal(25);
     }
     catch(NoRevision obj){
         System.out.println(obj);
     }
    }

    void getSalary(){
        System.out.println("Salary is: "+this.salary);
    }
}

class SalesManager extends Employee implements RevisedSalary{
    int Totalsales;
    
    SalesManager(String name, double salary, int totalsales){
        this.full_name = name;
        this.salary = salary;
        this.Totalsales = totalsales;
    }

    public double Rsal(double percentage){
        this.salary += this.salary*(percentage/100);

        return salary;
    }
    void increment(){

     try{
        if(Totalsales < 20){
            NoRevision obj = new NoRevision("Totalsales are less than 20");
            throw obj;
        }

        if(Totalsales == 20)
            this.salary  = Rsal(10);
        else if(Totalsales == 30)
            this.salary = Rsal(20);
        else if(Totalsales > 30)
            this.salary = Rsal(25);
     }
     catch(NoRevision obj){
         System.out.println(obj);
     }
    }

    void getSalary(){
        System.out.println("Salary is: "+salary);
    }

}

class Driver{
    public static void main(String args[]){

        SalesManager emp1 = new SalesManager("Santosh", 12000, 5);
        emp1.increment();
        emp1.getSalary();
        ProjectManager emp2 = new ProjectManager("Rahul", 10000, 15, 20);
        emp2.increment();
        emp2.getSalary();


    }
}



    
