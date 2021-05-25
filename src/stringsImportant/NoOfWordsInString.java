package stringsImportant;

public class NoOfWordsInString {
	
	public static void main(String[] args) {
		
		String str="ThisIsCamelCase";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=(char)65 && str.charAt(i)<=(char)90)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
