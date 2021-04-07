package lab6;

import java.util.*;

public class Exe1 {
	List<Integer> getValues(HashMap<Integer,Integer> hash)
	{
		List<Integer> list=new ArrayList<>(hash.values());
		Collections.sort(list);
		return list;
		
		
	}
	public static void main(String[] args) {
		
		Exe1 ob=new Exe1();
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		System.out.println("Enter no of elements in hashmap");
		int n=sc.nextInt();
		System.out.println("Enter elements in hashmap");
		for(int i=1;i<=n;i++)
		{
			hash.put(i, sc.nextInt());
		}
		List<Integer> list=ob.getValues(hash);
		System.out.println(list);
		sc.close();
	}

}
