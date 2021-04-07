package lab6;

import java.util.*;
import java.util.Scanner;

public class Exe6 {
	static int n;
	List<Integer> votersList(HashMap<Integer,Integer> hash)
	{
		List<Integer> list=new ArrayList<>();
		Set<Integer> set=hash.keySet();
		for(int i:set)
		{
			if(hash.get(i)>18)
			{
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		Exe6 ob=new Exe6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of voters");
		n=sc.nextInt();
		System.out.println("Enter the student voterid and age");
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			hash.put(sc.nextInt(), sc.nextInt());
		}
		List<Integer> list=ob.votersList(hash);
		System.out.println(list);
		sc.close();
	}

}
