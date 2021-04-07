package lab4;

public class SavingsAccount extends Account {
	
	final double miniBalance=500;
	
	SavingsAccount(long accNumber, double balance) 
	{
		super(accNumber, balance);
		
	}
	
	
	//overriding withdraw method
	void withdraw(double balan)
	{
		if(getBalance()>miniBalance)
		{
			this.setBalance(getBalance()-balan);
		}
		System.out.println("Saving Account data");
	}
	

	@Override
	public String toString() 
	{
		return "SavingsAccount [accHolder=" + accHolder + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
