import java.util.*;
class Sum
{   
     public int sum(int arr[], int n, int s)
     {
          int count=0;
          int sum=0;
          int count1=0;
          
          for(int i=0; i<n; i++)
          {    
               sum=0;
               for(int j=i+1; j<n; j++)
               {
                    sum =arr[i] + arr[j];
                    if(sum == s)
                    {
                         count1++;
                         if(count < count1)
                         {
                              count = count1;
                              break;
                         }
                    }
               }
          }
          return count;
     }
}
class Arr94
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
               System.out.println("Enter number ");
               int s=sc.nextInt();
		     Sum obj = new Sum();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               System.out.println("Number Of pair:-  "+obj.sum(arr, n, s));
          }
          else
            System.out.print("Invalid size");
	}
}