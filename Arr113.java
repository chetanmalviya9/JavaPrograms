import java.util.Scanner;

class Merge
{
     public void merge(int arr1[],int n,int arr2[],int m){
          
          for(int i=0; i<n-1; i++)
          {
               for(int j=i+1; j<n; j++)
                 if(arr1[i] > arr1[j])
                 {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                 }
          }
          System.out.println("Array 1 after sorting :-");		     
          for(int i=0;i<n;i++)
          System.out.print(arr1[i]+" ");
          System.out.println();		

          for(int i=0; i<m-1; i++)
          {
               for(int j=i+1; j<m; j++)
                 if(arr2[i] < arr2[j])
                 {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                 }
          }

          System.out.println("Array 2 after sorting:-");		     
          for(int i=0;i<m;i++)
          System.out.print(arr2[i]+" ");
          System.out.println();		

          int arr3[] =new int[n+m];
          int k=0;
          int i,j;
          for( i=0,j=m-1;i<n&&j>=0;)
          {

               if(arr1[i]<arr2[j])
               arr3[k]=arr1[i++];
               else
               arr3[k]=arr2[j--];
               k++;
          }
          for(i=i;i<n;i++)
          {
               arr3[k]=arr1[i];
               k++;
          }
          for(j=j;j>=0;j--)
          {
               arr3[k]=arr2[j];
               k++;
          }
          System.out.println("array :-");		     
          for(int a=0;a<m+n;a++)
          System.out.print(arr3[a]+" ");
          System.out.println();		

     }
}
public class Arr113
{
     public static void main(String[] args) 
     {
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter the size of 1st array");
		int n=sc.nextInt();
          System.out.println("Enter the size of 2nd array");
		int m=sc.nextInt();
          if(n>0&&m>0)
          {
               int arr1[]=new int[n];
               System.out.println("Enter the Element of array");
               for(int i=0;i<n;i++)
               {
                    arr1[i]=sc.nextInt();
               }
               int arr2[]=new int[n];
               System.out.println("Enter the Element of array");
               for(int i=0;i<m;i++)
               {
                    arr2[i]=sc.nextInt();
               }
               Merge obj=new Merge();
               
               System.out.println("Given 1st array :-");		     
               for(int i=0;i<n;i++)
               System.out.print(arr1[i]+" ");
               System.out.println();		     

               
               System.out.println("Given 2nd array :-");		     
               for(int i=0;i<m;i++)
               System.out.print(arr2[i]+" ");
               System.out.println();		
               obj.merge(arr1,n,arr2,m);
          }
          else
          System.out.print("Invalid size");
	}
}
