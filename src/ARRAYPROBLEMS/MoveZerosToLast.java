package ARRAYPROBLEMS;

public class MoveZerosToLast 
{
	public static void main(String[] args) 
	{
		int arr[]= {0,1,0,4,12};
		int indx=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				arr[indx]=arr[i];
				indx++;
			}	
		}
		
		while(indx<arr.length)
		{
			arr[indx]=0;
			indx++;
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int j=0;
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" BBB");
		}
		
	}

}
