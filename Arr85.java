import java.util.*;
class Reverse
{   
     public int[] reverse(int arr[],int n)
     {
          for(int i=0; i<n/2; i++)
          {
               int j=n-1-i;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
          }
          return arr;
     }
}
public class Arr85 {
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
		     
               Reverse obj = new Reverse();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               arr = obj.reverse(arr, n);
               
               System.out.println("Reverse Array is :- ");
               for(int i=0; i<n; i++)
               {
                    System.out.print(arr[i]+" ");
               }
          }
          else
               System.out.print("Invalid size");
	} 
}
