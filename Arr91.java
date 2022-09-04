import java.util.*;
class Sort
{   
     public int[] sort(int arr[],int n)
     {
          int i ,j,k=0,temp=0;
          for(i=0; i<n; i++)
          {
              if (arr[i] > 0)
              {
                  temp = arr[i];
                  for(j=i; j>k; j--)
                  {
                      arr[j] = arr[j-1];
                  }
                  arr[k] = temp;
                  k++;
              }
          }
          return arr;
     }
}
class Arr91
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
		int n = sc.nextInt();
          if(n>=0)
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
               
               obj.sort(arr,n);

               System.out.println("Sorted Array is :- ");
               for(int i=0; i<n; i++)
               {
                    System.out.print(arr[i]+" ");
               }
          }
          else
          System.out.print("Invalid size");
	}
}