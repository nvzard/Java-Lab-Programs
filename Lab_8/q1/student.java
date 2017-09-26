


class Student_info{

    String name, address, branch, department;

    Student_info(String name, String address, String branch, String dept){
        this.name = name;
        this.address = address;
        this.branch = branch;
        this.department = dept;
    }
    
    void display(){

        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Branch: "+branch);
        System.out.println("Department: "+department);

    }
    

}

class Student_regular extends Student_info{


    Student_regular(String a, String b, String c, String d){
        
        super(a,b,c,d);
    }

}


class Student_etc extends Student_regular{

    int marks, attendance;

    Student_etc(String name, String address, String branch, String dept, int marks, int attendance){
        super(name,address,branch,dept);
        this.marks = marks;
        this.attendance = attendance;
    }

    void display(){

        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Branch: "+branch);
        System.out.println("Department: "+department);
        System.out.println("Marks: "+marks);
        System.out.println("Attendance: "+attendance+"%");

    }

}

class Driver{

    public static void main(String[] args){

        Student_info info = new Student_info("Nikhil","Mumbai","IT","SCIT");
        Student_regular regular = new Student_regular("Nigga", "Nigga", "Nigga","Nigga");
        Student_etc etc = new Student_etc("Pro","MIT","CSE","Pro-ness",100,99);
    
        info.display();
        System.out.println();
        regular.display();
        System.out.println();
        etc.display();

    }
}
