import java.util.Scanner;

class BubbleSort
{
     public void bubbleSort(int arr[],int n){          
         for(int i=0;i<n;i++)
         {
               for(int j=0;j<n-1-i;j++)
               {
                   if(arr[j]>=arr[j+1])
                  {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  }

               }
         }
         System.out.println("array After Sorting-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");    
     }
}

class Arr119
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
               BubbleSort obj=new BubbleSort();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
          
              obj.bubbleSort(arr,n);       
          }
          else
          System.out.print("Invalid size");
	}
}