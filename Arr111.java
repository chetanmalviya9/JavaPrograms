import java.util.Scanner;

class Search
{
     public int searchEl(int arr[],int n,int s){          
         for(int i=0;i<n;i++)
          if(arr[i]==s)
          return 1 ;
          
          return 0;
     }
}

class Arr111
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
               Search obj=new Search();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               System.out.println("Enter Element that you want to search");
               int s=sc.nextInt();
          
              System.out.println(obj.searchEl(arr,n,s));       
          }
          else
          System.out.print("Invalid size");
	}
}