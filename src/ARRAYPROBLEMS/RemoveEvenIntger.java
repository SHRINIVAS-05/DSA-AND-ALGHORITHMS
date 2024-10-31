package ARRAYPROBLEMS;

public class RemoveEvenIntger 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,2,4,7,10,6,5};
		int oddNumber=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				oddNumber++;
			}
		}
		
		int result[]= new int[oddNumber];
		int indx = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				result[indx]=arr[i];
				indx++;
			}
		}
		
		for (int i : result) 
		{
			System.out.println(i);
		}
	}

}
