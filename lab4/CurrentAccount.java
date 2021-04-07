package lab4;

public class CurrentAccount extends SavingsAccount {

	double overdraftLimit=10000;
	CurrentAccount(long accNumber, double balance) 
	{
		super(accNumber, balance);
	
	}
	
	//withdraw method overriding
	void withdraw(double balan)
	{
		if(getBalance()>overdraftLimit)
		{
			System.out.println("Limit exeeded");
		}
		else
		{
			this.setBalance(getBalance()-balan);
		}
		System.out.println("Current Account data");
	}
	@Override
	public String toString() {
		return "CurrentAccount [accHolder=" + accHolder + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
