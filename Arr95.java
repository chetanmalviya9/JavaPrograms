import java.util.*;
class Sort
{   
     private int arr1[],arr2[],arr3[];
     private int n1,n2,n3;

     public Sort(int arr1[],int n1,int arr2[],int n2,int arr3[],int n3)
     {
          this.arr1 = arr1;
          this.n1 = n1;
          this.arr2 = arr2;
          this.n2 = n2;
          this.arr3 = arr3;
          this.n3 = n3;
          this.sort();
     }
     public int[] sort()
     {
          int i ,j,k=0;
          int temp[]=new int[n1];
          for(i=0; i<n1; i++)
          {
               for(j=0; j<n2; j++)
               {
                    for( k=0;k<n3;k++)
                         if(arr1[i]==arr2[j]&&arr1[i]==arr3[k])
                              temp[i]=arr1[i];
               }
          }
              return temp;
     }
     
}
class Arr91
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of first array");
		int n1 = sc.nextInt();
          System.out.println("Enter the size of second array");
		int n2 = sc.nextInt();
          System.out.println("Enter the size of third array");
		int n3 = sc.nextInt();
          if(n1>=0 && n2>=0 && n3>=0)
          {
		     int arr1[]=new int[n1];
		     int arr2[]=new int[n2];
		     int arr3[]=new int[n3];
               System.out.println("Enter the Element of first array");
               for(int i=0; i<n1; i++)
               {
                    arr1[i] = sc.nextInt();
               }
               System.out.println("Enter the Element of second array");
               for(int i=0; i<n2; i++)
               {
                    arr2[i] = sc.nextInt();
               }
               System.out.println("Enter the Element of third array");
               for(int i=0; i<n3; i++)
               {
                    arr3[i] = sc.nextInt();
               }
		    Sort obj = new Sort(arr1,n1,arr2,n2,arr3,n3);
              int arr[]=new int[n1];
              arr=obj.sort();
              for(int x:arr)
              if(x>0)
             System.out.print(x);
          }
          else
          System.out.print("Invalid size");
	}
}