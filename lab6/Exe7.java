package lab6;

import java.util.*;
import java.util.Scanner;


public class Exe7 {
	
	static int n;
	
	int[] getSorted(int[] list)
	{
		int rev[]=new int[list.length];
		int j=list.length-1;
		for(int i=0;i<list.length;i++)
		{
			rev[j]=list[i];
			j--;
		}
		String strArray[]=new String[n];
		for (int i = 0; i < rev.length; i++)
		{
			strArray[i] = String.valueOf(rev[i]);
			
		}
		
        Arrays.sort(strArray);
        int[] result=new int[n];
        for(int i =0; i<n;i++)
        {
            result[i]= Integer.parseInt(strArray[i]);// Parsing from string to int
        }

        return result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe7 ob=new Exe7();
		System.out.println("enter no of elements in an array");
		n=sc.nextInt();
		int[] list=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		int[] rev=ob.getSorted(list);
		for(int i=0;i<n;i++)
		{
			System.out.print(rev[i]+" ");
		}
		
		
		sc.close();
	}

}
