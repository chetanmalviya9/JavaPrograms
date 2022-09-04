import java.util.*;
class Sum
{   
     private int firstIn;
     private int lastIn;
     
     public void sum(int arr[], int n)
     {
          int sum=0;
          for(int i=0; i<n; i++)
          {    
               sum=0;
               for(int j=i; j<n; j++)
               {
                    sum += arr[j];
                    if(sum == 0)
                    {
                         System.out.println("Yes");
                         this.lastIn = j+1;
                         this.firstIn = i+1;
                         break;
                    }
               }
               if(this.firstIn !=0 && this.lastIn !=0)
               break;
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
class Arr100
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
          
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.println(arr[i]+" ");
               
		     Sum obj = new Sum();
               obj.sum(arr, n);
               
               int first = obj.getFirstIndex();
               int last = obj.getlastIndex();
               
               if(first==last)
               System.out.println("Sum of element is in Index of"+first);
               else
               System.out.println("Sum of element is from Index "+first+" to "+last);
               
          }
          else
            System.out.print("Invalid size");
	}
}