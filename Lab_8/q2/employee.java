class Employee{

    String name, address;

    void display(){

        System.out.println("Name: "+this.name+"\nAddress: "+this.address);

    }

    Employee(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    
}

class Full_time_employee extends Employee{
    
    int salary;
    String desgn;

    Full_time_employee(String name, String address, String desgn, int salary){

        super(name, address);
        this.desgn = desgn;
        this.salary = salary;
    }

    void display(){
        super.display();
        System.out.println("Salary: "+salary+"\nDesgn: "+desgn);
    }

}

class Part_time_employee extends Employee{

    int w_hrs, rph;

    Part_time_employee(String name, String address, int w_hrs, int rph){
        super(name, address);
        this.w_hrs = w_hrs;
        this.rph = rph;
    }

    void calculate_pay(){
        System.out.println("Amount Payable: "+rph*w_hrs);
    }

    void display(){
        super.display();
        System.out.println("Working Hours: "+w_hrs+"\nRate/hr: "+rph);
        calculate_pay();
    }

}

class Main{
    public static void main(String args[]){
    
        Employee emp = new Employee("Nikhil", "Mumbai");


        Full_time_employee full = new Full_time_employee("Nikhil", "Mumbai","Cleaner", 10);
        Part_time_employee part = new Part_time_employee("Nikhil", "Mumbai", 24, 10);

        emp.display();
        System.out.println();
        part.display();
        System.out.println();
        full.display();

    }

}




