public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		System.out.println(Driver.stringToCharArray(s));
	}
	static char[] stringToCharArray(String s)
	{
		char[] lengthOfString = new char [s.length()];
		for( int i = 0; i < s.length(); i = i + 1)
		{
			lengthOfString[i] = s.charAt(i); 
		}
		return lengthOfString; 
	}
}