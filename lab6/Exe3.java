package lab6;
import java.util.*;
public class Exe3 {
	static int n;
	
	HashMap<Integer,Integer> getSquares(List<Integer> list)
	{
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int k=list.get(i);
			k=(k*k);
			hash.put(list.get(i), k);
		}
		return hash;
	}
	
	
	public static void main(String[] args) {
		Exe3 ob=new Exe3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of numbers");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		HashMap<Integer,Integer> hash=ob.getSquares(list);
		System.out.println(hash);
		sc.close();

	}

}
