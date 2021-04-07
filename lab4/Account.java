package lab4;

public class Account {
	private long accNumber;
	private double balance;
	int bal;
	Person accHolder;
	
	public Account() {}
	
	
	public Account(long accNumber,double balance )
	{
		this.accNumber=accNumber;
		this.balance=balance;
	}
	void deposit(double bal)
	{
		this.balance=balance+bal;
	}
	
	void withdraw(double bal)
	{
		this.balance=balance-bal;
	}
	
	//getters and setters for account balance
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	//getters and setter for account number
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
}
