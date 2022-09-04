import java.util.Scanner;

class BinarySearch
{
     public void binarySearch(int arr[],int n,int k){
          
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
          int low =0;
          int high=n-1;
          while(low<=high)
          {
               int mid=(high+low)/2;
               if(arr[mid]==k)
               {
                    System.out.println("Element found");
               }
               else if(arr[mid]<n)
               {
                    high=mid-1;
               }
               else
               {
                    low=mid+1;
               }
          }
          System.out.println("Element not found");
     }
}
public class Arr116
{
     public static void main(String[] args) 
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
               BinarySearch obj=new BinarySearch();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               System.out.println("Enter Element ");
               int s=sc.nextInt();
               obj.binarySearch(arr,n,s);     
          }
          else
          System.out.print("Invalid size");
	}
}
