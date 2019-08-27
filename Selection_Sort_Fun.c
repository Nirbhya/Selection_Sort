// Program based on selection sort technique using Functions ( Written By Nirbhya Kaushik )

#include<stdio.h>
void input_array(int [],int,int);
void logic(int [],int,int);				                               // Function Declaration
void output_array(int [],int,int);

//--------------------------------------------------------------------------------------------

void main()
{
	int arr[50],size,low=0;												              // Variable Declaration
	printf("Enter, How many elements do you want in array : ");
	scanf("%d",&size);													                // Input of 'size' Variable

//--------------------------------------------------------------------------------------------

	input_array(arr,low,size);			// Calling for input function
	logic(arr,low,size);					// Calling for logic function
	output_array(arr,low,size);			// Calling for output function

}
	
//--------------------------------------------------------------------------------------------


void input_array(int x[],int l, int s)
{
	int i;	
	for(i=l;i<s;i++)
	{
		scanf("%d",&x[i]);				// Input Array Elements
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
			printf("%d\n",x[i]);				//Output of Sorted Array
		}
}
//------------------------------------------------------------------------------------------------
