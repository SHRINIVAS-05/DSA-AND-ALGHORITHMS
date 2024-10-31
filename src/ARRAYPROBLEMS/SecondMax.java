package ARRAYPROBLEMS;

public class SecondMax {

	public static void main(String[] args) 
	{
		int arr[]= {12,34,2,34,33,1};
		int SecondMax=Integer.MIN_VALUE;
		int Max=Integer.MIN_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(Max<arr[i])
			{
				SecondMax=Max;
				Max=arr[i];
			}
			else if(SecondMax<arr[i]&& Max>arr[i] )
			{
				SecondMax=arr[i];
			}
		}
		System.out.println(SecondMax);
		System.out.println(Max);

	}

}
