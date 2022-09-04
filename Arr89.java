import java.util.Scanner;

class Sorting
{
     public int[] sorting(int arr[],int n)
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
          return arr;
     }
}
public class Arr89 
{
     public static void main(String[] args) 
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
               Sorting obj = new Sorting();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               arr=obj.sorting(arr,n);
               System.out.println("Sorted array:- ");
               for(int i=0;i<n;i++)
               System.out.println(arr[i]+" ");
              
          }
          else
          System.out.print("Invalid size");
     }
}
