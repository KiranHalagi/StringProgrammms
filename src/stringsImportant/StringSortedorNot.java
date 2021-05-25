package stringsImportant;

import java.util.Arrays;

public class StringSortedorNot {

	
	public static void main (String args[])
	{
		SortedOrNot();
		
	}
	
	
	public static void  SortedOrNot()
	{
		String s1="acbd";
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int flag=0;
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]>ch[i+1])
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("sorted");
		}else
		{
			System.out.println("not sorted");
		}
	}
	
}
