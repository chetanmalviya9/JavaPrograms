import java.util.Scanner;

class Nearest{
     public void nearest(int arr[],int num){
          int index=0;
          int n=arr.length;
          for(int i=0;i<n;i++)    
          {
              if(arr[i]==num)
                 index=i;
          }
          {
              if(index-1<0)
                 System.out.println("nearest lesser = "+arr[index]);
              else
              System.out.println("nearest lesser = "+arr[index-1]);
          }
          {
              if (index+1>=n)
              System.out.print("nearest greater =  "+arr[index]);
              else
              System.out.print("nearest greater = "+arr[index+1]);
          }
     }
}
public class Arr105 {
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
               int num=sc.nextInt();
          
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.println(arr[i]+" ");
               
		     Nearest obj = new Nearest();
               obj.nearest(arr, num);
          }
          else
            System.out.print("Invalid size");
	}
}