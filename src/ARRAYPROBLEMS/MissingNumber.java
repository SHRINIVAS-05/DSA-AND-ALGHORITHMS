package ARRAYPROBLEMS;

public class MissingNumber 
{
	public static void main(String[] args)
	{
		int arr[]= {2,4,1,8,6,3,7};
		
		int n=arr.length+1;
		int total= (n*(n+1))/2;
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		total=total-sum;
		System.out.println("Missing number is "+total);
		
	}

}
