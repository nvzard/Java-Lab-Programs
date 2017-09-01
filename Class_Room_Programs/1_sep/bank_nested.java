
class Bank{
    String custName;
    final int accNo;
    int balance, withdraw, deposit;

    Loan obj = new Loan();
    Bank(int accNo){
        this.accNo = accNo;
    }

    void withdraw(int amount){
        balance -= amount;
    }
    
    void display(){
        System.out.println("Balance: "+balance);
    }

    void deposit(int amount){
        balance += amount;
    }

    void dummy(){
    }

    class Loan{
        final int accNo = this.accNo;
        int loanCount;
        int activeLoanCount;
        int maxLoan;
        int annualIncome;
        boolean defaulter;
        
        void loanRequest()
        {
           if(annualIncome < 500000)
                maxLoan = 500000;
            else if(annualIncome > 500000 && annualIncome < 100000)
                maxLoan = 200000;
            else if(annualIncome > 1000000)
                maxLoan = 3000000;

            if(loanCount <= 2)
                System.out.println("Eligible");

            if(defaulter == false)
                System.out.println("Not eligible");
        }

    }
}

class Driver{

    public static void main(String[] args){
        
        Bank obj = new Bank(999999);
        obj.deposit(1000);
        obj.display();
        System.out.println(obj);
    }
}
