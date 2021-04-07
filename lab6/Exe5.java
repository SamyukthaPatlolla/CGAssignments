package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exe5 {
	
	static int n;
	
	int getSecondSmallest(List<Integer> list)
	{
		Collections.sort(list);
		int result=list.get(1);
		return result;
	}
	public static void main(String[] args) {
		Exe5 ob=new Exe5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of numbers");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Second smallest element is "+ob.getSecondSmallest(list));
		sc.close();
	}

}
