import java.util.*;
class Max_Min
{
     private int max=-2147483648;
     private int min=2147483647;
     public void maxMin(int arr[],int n)
     {
          for(int i=0;i<n;i++)
          {
               if(arr[i]>max)
               {
                    this.max=arr[i];
               }
               if(arr[i]<min)
               {
                    this.min=arr[i];
               }
          }
     }
     public int getMax()
     {
          return this.max;
     }
     public int getMin()
     {
          return this.min;
     }
}
class Arr84
{
     public static void main(String args[])
     {
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter the size of array");
		int n=sc.nextInt();
          if(n>=0)
          {
		     int arr[]=new int[n];
               System.out.println("Enter the Element of array");
               for(int i=0;i<n;i++)
               {
                    arr[i]=sc.nextInt();
               }
		     Max_Min obj=new Max_Min();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               obj.maxMin(arr, n);
              
               System.out.println("Maximum Element is :- "+obj.getMax());
	          System.out.println("Minimum Element is :- "+obj.getMin());
	               
          }
          else
          System.out.print("Invalid size");
	}
}