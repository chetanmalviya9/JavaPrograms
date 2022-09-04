import java.util.Scanner;
public class Arr102
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i = 0;i < size; i++)
        arr[i] = sc.nextInt();
        System.out.println("Array elements are :");
        for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
		int max=-2147483648,product=0;
        for(int i = 0;i < arr.length-1;i++)
        {
            product = arr[i];
            for(int j = i+1 ;j<arr.length ;j++)
            {
               
                product = product*arr[j];
                if(product == 0)
                break;
            }
            if(product > max)
                max = product;
        }
        System.out.println("Maximum product of subarray is :" + product);
	}
}