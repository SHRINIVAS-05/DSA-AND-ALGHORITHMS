package ARRAYPROBLEMS;

public class Palindrome 
{
	public static boolean isPalindrome(String word)
	{
		char[] charArray=word.toCharArray();
		int start=0;
		int end=charArray.length-1;
		System.out.println(end);
		while(start<end)
		{
			if(charArray[start]!=charArray[end])
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) 
	{
		String word="that";
		System.out.println(isPalindrome(word));
		
	}

}
