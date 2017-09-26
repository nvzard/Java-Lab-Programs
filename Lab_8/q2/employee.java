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

    void display(){
        super.display();
        System.out.println("Working Hours: "+w_hrs+"\nRate/hr: "+rph);

    }

}

class Main{
    public static void main(String args[]){

        Full_time_employee full = new Full_time_employee("Nikhil", "Mumbai","Cleaner", 10);

        full.display();

    }

}




