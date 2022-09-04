import java.util.*;
class Sum
{   
     public int sum(int arr[], int n)
     {
          int max = -2147483648;
          int sum=0;
          
          for(int a:arr)
          {
              sum+=a;
              if(sum>max)
              max =sum;
              if(sum<0){
                  sum=0;
              }
          }
          return max;
     }
}
class Arr101
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
               
               System.out.println("Maximum Sum of element is "+obj.sum(arr, n));
               
          }
          else
            System.out.print("Invalid size");
	}
}