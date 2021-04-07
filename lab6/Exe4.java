package lab6;


import java.util.HashMap;
import java.util.*;

import java.util.Scanner;

public class Exe4 {

	static int n;
	
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hash)
	{
		HashMap<Integer,String> hash1=new HashMap<>();
		Set<Integer> set=hash.keySet();
		for(Integer i:set)
		{
			if(hash.get(i)>=90)
			{
				hash1.put(i, "Gold");
			}
			else if(hash.get(i)>=80 && hash.get(i)<90)
			{
				hash1.put(i, "Silver");
			}
			else if(hash.get(i)>=70 && hash.get(i)<80)
			{
				hash1.put(i, "Bronze");
			}
			else if(hash.get(i)<70)
			{
				hash1.put(i, "No Medal");
			}
			
		}
		return hash1;
	}
	
	
	public static void main(String[] args) {
		Exe4 ob=new Exe4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students");
		n=sc.nextInt();
		System.out.println("Enter the student registration number and marks");
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			hash.put(sc.nextInt(), sc.nextInt());
		}
		HashMap<Integer,String> hash1=ob.getStudents(hash);
		System.out.println(hash1);
		sc.close();
	}

}
