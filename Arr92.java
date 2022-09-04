import java.util.*;
class Union
{   
     private int arr1[];
     private int n1;
     private int arr2[];
     private int n2;

     public Union(int arr1[],int n1,int arr2[],int n2)
     {
          this.arr1 = arr1;
          this.n1 = n1;
          this.arr2 = arr2;
          this.n2 = n2;
          this.union();
     }
     public void union()
     {
          int i ,j,k=0,temp=0;
          for(i=0; i<n1; i++)
          {
              if (arr2[i] > 0)
              {
                  temp = arr[i];
                  for(j=i; j>k; j--)
                  {
                      this.arr[j] = arr[j-1];
                  }
                  this.arr[k] = temp;
                  k++;
                  
              }
          }
     }
     public int getUnionArray()
     {
          System.out.println("Sorted Array is :- ");
          for(int i=0; i<n; i++)
          {
               System.out.print(arr[i]+" ");
          }
     }
}
public class Arr92
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of first array");
		int n1 = sc.nextInt();
          System.out.println("Enter the size of second array");
		int n2 = sc.nextInt();
          if(n1>=0||n2>=0)
          {
		     int arr1[]=new int[n1];
		     int arr2[]=new int[n2];
               System.out.println("Enter the Element of first array");
               for(int i=0; i<n1; i++)
               {
                    arr1[i] = sc.nextInt();
               }
               System.out.println("Enter the Element of second array");
               for(int i=0; i<n1; i++)
               {
                    arr2[i] = sc.nextInt();
               }
		    
		    Union obj = new Union(arr1,n1,arr2,n2);
              obj.getUnionArray();
          }
          else
          System.out.print("Invalid size");
	}
}