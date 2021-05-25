package stringsImportant;

public class ReverseString {

	public static void main(String[] args) {
		Reverse();

	}
	
	public static void Reverse()
	{
		String s="dad";
		String s1="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch=s.charAt(i);
			
			s1=s1+ch;	
			
		}
		//System.out.println(s1);
		
		if(s.equals(s1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
     		
	}

}
