package com.cg.eis.exception;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee salary");
		int salary=sc.nextInt();
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("Salary below 3000");
			}
			else
			{
				System.out.println("salary above 3000");
			}
		}
		catch(EmployeeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}

	}

}
