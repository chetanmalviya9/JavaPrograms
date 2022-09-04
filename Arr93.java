import java.util.*;
class CyclicRotate
{   
     public int[] rotate(int arr[],int n)
     {
          int temp = arr[n-1];
          for(int i = n-1; i>0; i--)
          {
               arr[i] = arr[i-1]; 
          }
          arr[0] = temp;
          return arr;
     }
}
class Arr93
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
		int n = sc.nextInt();
          if(n >= 0)
          {
		     int arr[]=new int[n];
               System.out.println("Enter the Element of array");
               for(int i=0; i<n; i++)
               {
                    arr[i] = sc.nextInt();
               }
               CyclicRotate obj = new CyclicRotate();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               arr= obj.rotate(arr,n);
               System.out.println("After Cyclic Rotate :- ");
               for(int i=0; i<n; i++)
               {
                    System.out.print(arr[i]+" ");
               }
          }
          else
          System.out.print("Invalid size");
	}
}