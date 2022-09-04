class Positive_negative
{
	public static void main(String args[])
	{
		int arr[]={34,-5,-2,66,-22,77,33,-1};
		int n=arr.length;
		int k=0;
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
			   a[k]=arr[i];
			   k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if (arr[i]<0)
			{
			   a[k]=arr[i];
			   k++;
			}
		}
		for(int i=0;i<n;i++)
		{
		     arr[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
}
}

				