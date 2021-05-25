package stringsImportant;

public class RevCompleteSentense {

	public static void main(String[] args) {
		RevSentense();

		
	}
	
	public static void  RevSentense()
	{
		String s1="India is great";
		String s2[]=s1.split(" ");
		String s3="";
		
		for(int i=s2.length-1;i>=0;i--)
		{
			for(int j=s2[i].length()-1; j>=0; j--)
			{
				System.out.print (s2[i].charAt(j));
			}
			System.out.println("");
		}
		
		
	}

}
