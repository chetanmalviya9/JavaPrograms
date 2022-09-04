import java.util.*;
class Sum
{      
     public int nonRepeat(int arr[], int n)
     {
          int s=0;
          int count=0;
          for(int i=0; i<n; i++)
          {    
               count=0;
               for(int j=0; j<n; j++)
               {
                    if(arr[i]==arr[j]&&i!=j)
                    {
                         count++;
                    }
               }
               if(count==0)
               {
                    s=arr[i];
                    break;
               }
          }
          return s;
     }
}
class Arr97
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
                    do{
                         arr[i] = sc.nextInt();
                         
                         if(arr[i]==0)
                           System.out.println("Please enter non zero values");
                    
                    }while(arr[i]==0);
               }
               sc.close();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
               
               Sum obj = new Sum();
               System.out.println("First Non Repeating Element is:- "+obj.nonRepeat(arr, n));
          }
          else
            System.out.print("Invalid size");
	}
}