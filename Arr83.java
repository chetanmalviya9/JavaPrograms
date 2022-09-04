import java.util.Scanner;
class Peak
{
     private int peak=-2147483648;
     private int a=0;
     public int peakElement(int arr[],int n){          
          for(int i=0;i<n;i++)
          {
               if(arr[i]>peak)
               {
                    this.peak=arr[i];
                    this.a=i+1;
               }
          }
          return a;
     }
}

class Arr83
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
               Peak obj=new Peak();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               System.out.println("Peak Element Index is :- "+obj.peakElement(arr, n));               
          }
          else
          System.out.print("Invalid size");
	}
}