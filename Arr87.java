import java.util.Scanner;

class KthElement
{
     int arr[];
     int n;
     int k;
     public void element(int arr[],int n,int k){
          this.arr=arr;
          this.n=n;
          this.k=k;
          for(int i=0; i<n-1; i++)
          {
               for(int j=i+1; j<n; j++)
                 if(arr[i] > arr[j])
                 {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
          }
     }
     public int getkthSmallest(){
          return arr[k-1];
     }
     public int getkthLargestest(){
          return arr[n-k];
     }
}
public class Arr87 
{
     public static void main(String[] args) 
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
               KthElement obj=new KthElement();
               
               System.out.println("Given array is:-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr[i]+" ");

               System.out.println("Enter Element ");
               int s=sc.nextInt();
               obj.element(arr,n,s);
              System.out.println("Kth smallest element:- "+obj.getkthSmallest());       
              System.out.println("Kth Largest Element:- "+obj.getkthLargestest());       
          }
          else
          System.out.print("Invalid size");
	}
}
