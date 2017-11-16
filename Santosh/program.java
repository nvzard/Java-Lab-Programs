import myemp.Employee;

interface RevisedSalary{
    double Rsal(double percentage);
}

class ProjectManager extends Employee implements RevisedSalary{
    
    int Totalprojects, Totalbugsfixed;

    public double Rsal(double percentage){    
        this.salary += this.salary*(percentage/100);

        return salary;
    }
}

class SalesManager extends Employee implements RevisedSalary{
    int Totalsales;
    
    public double Rsal(double percentage){
        this.salary += this.salary*(percentage/100);

        return salary;
    }
    public void increment(){
        if(Totalbugsfixed == 20 && Totalsales == 20)
            this.salary = Rsal(10);
        else if(Totalb
}





    
