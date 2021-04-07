package com.cg.eis.pl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,salary,designation,insuranceScheme");
		int id=sc.nextInt();
		String name=sc.next();
		int salary=sc.nextInt();
		String designation=sc.next();
		String insuranceScheme=sc.next();
		
		sc.close();
	}

}
