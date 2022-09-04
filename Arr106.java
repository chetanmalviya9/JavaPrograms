import java.util.Scanner;
class Sum
{
    
     public int sumOfArray(int arr[],int n){          
          int sum=0;
          for(int i=0;i<n;i++)
          {
               sum+=arr[i];
          }
          return sum;
     }
}

class Arr106
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
               Sum obj=new Sum();
               
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               int sum=obj.sumOfArray(arr, n);
               System.out.println("Sum of Array is :- "+sum);               
               System.out.println("Average of Array is :- "+sum/n);               
          }
          else
          System.out.print("Invalid size");
	}
}