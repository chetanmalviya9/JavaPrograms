import java.util.Scanner;

class InsertionSort
{
     public void insertionSort(int arr[],int n){          
         for(int i=0;i<n;i++)
         {
          int temp=arr[i];
          int j;
          for( j=i-1;j>=0;j--)
          {
               if(temp<=arr[j])
               arr[j+1]=arr[j];
               else 
               break;
          }
          arr[j+1]=temp;
         }
         System.out.println("array After Sorting-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
          
     }
}

class Arr118
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
               InsertionSort obj=new InsertionSort();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
          
              obj.insertionSort(arr,n);       
          }
          else
          System.out.print("Invalid size");
	}
}