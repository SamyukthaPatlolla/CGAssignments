package lab4;

public class Exe1 {

	public static void main(String[] args) {
		Account acc1=new CurrentAccount(123456,2000);
		Account acc2=new CurrentAccount(987654,3000);
		
		
		Person per1=new Person("Smith",23);
		Person per2=new Person("Kathy",25);
		
		acc1.accHolder=per1;
		acc2.accHolder=per2;
		
		acc1.deposit(2000);
		System.out.println(acc1.accHolder.getName()+" balance "+acc1.getBalance());
		acc2.withdraw(2000);
		System.out.println(acc2.accHolder.getName()+" balance "+acc2.getBalance());
		
		
		
	}

}
