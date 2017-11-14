import java.io.*;
import java.util.Scanner;

class BankAcct{
    static double balance;
    double rate;
    //private final String password = "abc123";

    BankAcct(double bal, double rate){
        this.balance = bal;
        this.rate = rate;
        System.out.println("Account Initialized");
    }

    class Private_Methods{
        final String password = "abc123";

        void calculateInterest(int time){
            double interest = (balance*rate*time)/100;
            BankAcct.balance += interest;
            System.out.println("Updated Balance is: "+BankAcct.balance);
        }
    }

}

class Driver{
    
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.println("Initialize Bank Account: ");
        System.out.print("Input initial balance: ");
        double bal = sc.nextDouble();
        System.out.print("Input rate of interest: ");
        double rate = sc.nextDouble();
        BankAcct acc = new BankAcct(bal, rate);
        
        System.out.print("Input password to calcualte interest: ");
        String pass = input.readLine();
        
        BankAcct.Private_Methods obj = new BankAcct(bal, rate).new Private_Methods();
        
        if(pass.equals(obj.password)){
            System.out.print("Input time for interest: ");
            int time = sc.nextInt();
            obj.calculateInterest(time);
        }else
            System.out.println("Login Failed!! Wrong Password");
    }
}

