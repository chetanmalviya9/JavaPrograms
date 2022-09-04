import java.util.*;
class Sort
{  
     public int sort(int arr[],int n)
     {
          for(int i=0; i<n-1; i++)
          {
               for(int j=i+1; j<n; j++)
                 if(arr[i] > arr[j])
                 {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
          }
          int count=0;
          for(int i=0; i<n-1; i++)
          {
               if(arr[i]==i+1)
               count++;
          }

          return count;
     }
}
class Arr103
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
		     
               Sort obj = new Sort();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               int sum=obj.sort(arr, n);
               
               System.out.println("sum of contigious subarray is :- "+sum);
          }
          else
          System.out.print("Invalid size");
	}
}