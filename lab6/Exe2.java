package lab6;
import java.util.*;


public class Exe2 {
	
	static int n;
	
	Map<Character,Integer> countChars(char[] ch)
	{
		int count[]=new int[256];
		
		char[] ch1=new char[n];
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			count[ch[i]]++;
		}
		for(int i=0;i<n;i++)
		{
			
			ch1[i]=ch[i];
			int count2=0;
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch1[j])
				{
					count2++;
				}
			}
			if(count2==1)
			{
				map.put(ch[i], count[ch[i]]);
			}
		}
		
		return map;
	}

	public static void main(String[] args) {
		
		Exe2 ob=new Exe2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in char array");
		n=sc.nextInt();
		char ch[]=new char[100];
		System.out.println("Enter character array");
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		Map<Character,Integer> map=ob.countChars(ch);
		System.out.println(map);
		sc.close();

	}

}
