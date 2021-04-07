package lab5;

import java.util.Scanner;

class MyException extends Exception{
	 public MyException(String s)
	 {
		 System.out.println(s);
	 }
}

 
public class Exe1 {	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try
        {
            // user defined exception
			if(age<15)
			{
				throw new MyException("Inavalid age");
			}
			else
			{
				System.out.println("valid age");
			}
            
        }
        catch (MyException ex)
        {
            
            ex.printStackTrace();
        }
		finally
		{
			sc.close();
		}
	}

}
