import java.util.Scanner;
public class Selection_Sort 
{
	public static void main(String args[])		      //Main Method
	{
		Scanner in=new Scanner(System.in);
		int n,i,j,temp=0,min=0;					              // Variable Declaration
		int arr[]=new int [50];					              // Array Declaration
		System.out.println("Enter, How many elements do you want in array : ");
		n=in.nextInt();							                  // Input of 'n' Variable
//------------------------------------------------------------------
		
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();			                  	// Input Array Elements
		}
		in.close();
		
//--------------------------------------------------------------------------

		for(i=0;i<n-1;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])				                // Logic of Selection Sort
				min=j;
			}
			temp=arr[i];
			arr[i]=arr[min];				                  	// Swapping of array elements
			arr[min]=temp;
		}
		
//--------------------------------------------------------------------------------

		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);				          //Output of Sorted Array
		}

	}
}
