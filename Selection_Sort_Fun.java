import java.util.Scanner;
class Selection
{
	Scanner in=new Scanner(System.in);			
	
//----------------------------------------------------------------------------------------------
	
	void input_array(int x[],int l, int s)
	{
		int i;	
		for(i=l;i<s;i++)
		{
			x[i]=in.nextInt();					// Input Array Elements
		}
	}

//---------------------------------------------------------------------------------------------

	void logic(int x[], int l, int s)
	{
	
		int i,j,min=0,temp=0;
		for(i=l;i<s-1;i++)
		{
			min=i;
			for(j=i+1;j<s;j++)
			{
				if(x[j]<x[min])				// Logic of Selection Sort
				min=j;
			}
			temp=x[i];
			x[i]=x[min];					// Swapping of array elements
			x[min]=temp;
		}
	}

//------------------------------------------------------------------------------------------------


		void output_array(int x[], int l, int s )
		{
			int i;
			for(i=l;i<s;i++)
			{
				System.out.println(x[i]);			//Output of Sorted Array
			}
		}
}
//------------------------------------------------------------------------------------------------



public class Selection_Sort_Fun
{
	public static void main(String args[])		//Main Method
	{
		int size,low=0;							// Input of 'size' Variable
		int arr[]=new int[50];
		Scanner in=new Scanner(System.in);
		Selection ob=new Selection();			//Object of Selection Class
		System.out.println("Enter, How many elements do you want in array : ");
		size=in.nextInt();
		in.close();
		ob.input_array(arr,low,size);
		ob.logic(arr,low,size);
		ob.output_array(arr,low,size);
	}
}