import java.util.Scanner;

class Occurance
{
     private int count=0;
     public int occur(int arr[],int n,int k)
     {
          for(int i=0;i<n;i++)
          {
               if(arr[i]==k)
               this.count++;
          }
          return count;
     }
}
public class Arr88 
{
     public static void main(String[] args) {
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
          
               System.out.println(" Enter Element:-");
               int k=sc.nextInt();

               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");
		     
               Occurance obj = new Occurance();
               obj.occur(arr, n, k);
               
               System.out.println("Occurance of "+k+" is:- "+ obj.occur(arr, n, k));
          }
          else
          System.out.print("Invalid size");
     }
}
