import java.util.Scanner;
class Swap
{
     public int[] swap(int arr[],int n){          
          int temp=arr[0];
          arr[0]=arr[n-1];
          arr[n-1]=temp;
          return arr;
     }
}

class Arr107
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
               Swap obj=new Swap();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               arr=obj.swap(arr, n);

               System.out.println("Array After Swap first and Last elements");   
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");            
          }
          else
          System.out.print("Invalid size");
	}
}