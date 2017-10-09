
abstract class Account{
    int balance, acc_no;
    String name, address;

    abstract void withdraw(int amt);
    abstract void deposit(int amt);

    void display(){
        System.out.println("Balance is: "+balance);
    }

}

class Savings_account extends Account{

    int rate;

    Savings_account(int a_no, int bal,int rate, String name, String add){
        acc_no = a_no;
        balance = bal;
        this.rate = rate;
        this.name = name;
        address = add;
    }

    void deposit(int amt){
        this.balance += amt;
        System.out.println("Deposited");
    }

    void withdraw(int amt){
        this.balance -= amt;
        System.out.println("Withdrawn");
    }

    double calculate_amount(){

        return  (balance + (rate*balance)/(double)100);
    }

    void display(){
        System.out.println("Account no: "+acc_no);
        System.out.println("Holder's Name: "+name);
        System.out.println("Holder's Address: "+address);
        System.out.println("Old Balance: "+balance);
        System.out.println("New Balance: "+ calculate_amount());
    }

}

class Current_account extends Account{

    int over_draft_limit;

    Current_account(int a_no, int bal,int odl, String name, String add){
        acc_no = a_no;
        balance = bal;
        over_draft_limit = odl;
        this.name = name;
        address = add;
    }

    void deposit(int amt){
        this.balance += amt;
        System.out.println("Deposited");
    }

    void withdraw(int amt){
        this.balance -= amt;
        System.out.println("Withdrawn");
    }

    void display(){
        super.display();
        System.out.println("Over Draft Limit is: "+over_draft_limit);
        System.out.println("Account no: "+acc_no);
        System.out.println("Holder's Name: "+name);
        System.out.println("Holder's Address: "+address);      
    }

}
        

class Driver{
    public static void main(String[] args){

    Savings_account sav = new Savings_account(16910, 15000, 8, "Nitanshu", "Jaipur");
    Current_account cur = new Current_account(15910, 20000, 50000, "Arjun", "Khanna");

    sav.display();
    cur.display();

    }

}
