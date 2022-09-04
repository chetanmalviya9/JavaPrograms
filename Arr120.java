import java.util.Scanner;

class SelectionSort
{
     public void selectionSort(int arr[],int n){          
         for(int i=0;i<n;i++)
         {
          int minIndex=i;
               for(int j=i+i;j<n;j++)
               {
                   if(arr[j]<arr[minIndex])
                  minIndex=j;
               
                    int temp =arr[minIndex];
                    arr[minIndex]=arr[i];
                    arr[i]=temp;

               }
         }
         System.out.println("array After Sorting-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");    
     }
}

class Arr120
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
               SelectionSort obj=new SelectionSort();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
          
              obj.selectionSort(arr,n);       
          }
          else
          System.out.print("Invalid size");
	}
}