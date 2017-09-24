import java.util.Scanner;
import java.io.*;
class Bank{
	Scanner sc=new Scanner(System.in);
	String customername=new String();
	int accountno;
	int balance,withdraw,deposit;
	//void withdraw(balance,withdraw);
	//void deposit(balance,deposit);
	  void account()
	{
		System.out.print("\nenter account no.:");
		accountno=sc.nextInt();
		sc.nextLine();
		System.out.print("\nenter name:");
		customername=sc.nextLine();
	}
	Bank()
	{
		balance=100000;
	}
	
		
	void statement()
		{
			System.out.print("current balance: Rs "+balance+"/-");
		}
	void dummy()
		{
			loan inner=new loan();
			inner.loanrequest();
		}
		
	  void withdraw()
		{
			System.out.print("\nenter camount to be withdrawn: Rs ");
			withdraw=sc.nextInt();
			System.out.print("\nTransaction Successful.");
			balance-=withdraw;
		}
	  void deposit()
		{
			System.out.print("\nneter amount to be deposited: Rs");
			deposit=sc.nextInt();
			System.out.print("Transaction Successful.");
			balance+=deposit;
		}

	void uneligible()
	{
	System.out.print("\nAccount holder is uneligible for loan.");
	}		

	void eligible(int amount)
	{
		System.out.print("\nAccount holder is eligible for loan.");
		System.out.print("\nmaximum loan amount: Rs "+maxloan(amount)+" Lakhs/-\n");
	}
	int maxloan(int income)
	{
		if(income<500000)
		{	return 8;	}
		else if(income<1000000)
		{	return 20;	}
		else 
		{	return 30;	}
	}

class loan{
		//string accountno;
		int loancount,activeloan;
		boolean defaulter=true;

		  void loanrequest()
		{
			int income=0;//loanamount,maxamount,income,activeloancount,loancount,paid;
			System.out.print("\nenter account no.:");
			if(sc.nextInt()==accountno)
			{
				System.out.print("annual income: Rs ");
				income=sc.nextInt();
				System.out.print("no. of loans pursued: ");
				int loancount=sc.nextInt();
				System.out.println("active loans(if any): ");
				if(sc.nextInt()<=2)
				{
					
					System.out.print("defaulter (if any):");
					defaulter=sc.nextInt()==0?false:true;
					
				}
			}
			else
			{
				System.out.print("\nInvalid Account Number.");
				return;
			}
		
			
		if(defaulter==false)
			{	eligible(income);	}
		else 	
			{	uneligible();		}
		}
		
	}

}
class bankdriver{
	public static  void main(String ...args){
	Scanner sc=new Scanner(System.in);
	int opt;char ch='Y';
	Bank bak=new Bank();
	
		bak.account();	
		while(ch=='Y')
		{
		//System.out.println("\n\n**BANK TUTORIAL**");
		//System.out.println("1. Login\n 2. exit");
		//opt=sc.nextInt();
		//bak.account();
		//while(opt==1)
		{	//bak.account();
			System.out.println("\n\n1. Statement\n2. Deposit Money\n3. Withdraw Money\n4. Apply for Loan\n5. exit ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					bak.statement();
					break;
				case 2:	
					bak.deposit();
					break;
				case 3:
					bak.withdraw();
					break;
				case 4:
					bak.dummy();
					break;
				case 5:
					opt=2;
					ch='N';
					break;
				default:
					System.out.print("\nPress\n1. continue\n2. exit\n:");
			}
		}
	}
	
}
}						
