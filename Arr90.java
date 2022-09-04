import java.util.*;
class Sum
{   
     private int firstIn;
     private int lastIn;

     
     public void sum(int arr[], int n, int s)
     {
          int sum=0;
          for(int i=0; i<n; i++)
          {    
               sum=0;
               for(int j=i; j<n; j++)
               {
                    sum += arr[j];
                    if(sum == s)
                    {
                         this.lastIn = j+1;
                         this.firstIn = i+1;
                    }
                    if(sum > s)
                    {
                         break;
                    }
               }
          }
          if(this.firstIn ==0 && this.lastIn ==0)
          System.out.println("no Elements found ");
     }
     public int getFirstIndex()
     {
          return firstIn;
     }
     public int getlastIndex()
     {
          return lastIn;
     }
}
class Arr90
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

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
		     Sum obj = new Sum();
               obj.sum(arr, n, s);
               System.out.println("Sum of element is from Index "+obj.getFirstIndex()+" to "+obj.getlastIndex());
          }
          else
            System.out.print("Invalid size");
	}
}