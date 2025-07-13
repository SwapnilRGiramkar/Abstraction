//Example of bank deposite  withdraw and displayBAlance method
package abstraction;

public abstract class Bank 
{
	double balance;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	Bank(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Balance : "+balance);
	}
	
	public abstract void withdraw(double amount);
	
	public abstract void displayBalance();
}
//---------------------------------------------------------------------------------
package abstraction;

public class SavingAccount extends Bank
{
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public  void displayBalance()
	{
		System.out.println("Balance : " +balance );
	}
	SavingAccount(double balance)
	{
		this.balance=balance;
	}
	public void withdraw(double amount)
	{
		if(balance>= 1000 && balance >=amount )
		{
			balance-=amount;
			System.out.println("Withdraw : "+amount);
			System.out.println("Amount credited successfully ");
		}
		else 
		{
			System.out.println("Insuffiecient Fund");
		}
	}
}
//-------------------------------------------------------------------------------
package abstraction;

public class BankDriver 
{
	public static void main(String[] args) 
	{
		Bank b = new SavingAccount(50000);
		b.displayBalance();
		b.withdraw(1000);
		b.deposit(40000.0);
	}
}

