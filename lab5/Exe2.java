package lab5;

import java.util.*;

class NameException extends Exception
{
	public NameException(String s)
	{
		System.out.println(s);
	}
}

public class Exe2 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String fName=sc.nextLine();
		System.out.println("Enter last name");
		String lName=sc.nextLine();
		try {
			if(fName.length()==0 && lName.length()==0)
			{
				throw new NameException("Invalid input");
			}
			else
			{
				System.out.println("valid name");
			}
		}
		catch(NameException e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
