// Program based on selection sort technique ( Written By Nirbhya Kaushik )

#include<stdio.h>
void main()
{
	int arr[50],n,i,j,temp=0,min=0;									// Variable Declaration
	printf("Enter, How many elements do you want in array : ");
	scanf("%d",&n);													// Input of 'n' Variable

//--------------------------------------------------------------------------------------------

	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);				// Input Array Elements
	}

//--------------------------------------------------------------------------------------------

	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(arr[j]<arr[min])				// Logic of Selection Sort
			min=j;
		}
		temp=arr[i];
		arr[i]=arr[min];					// Swapping of array elements
		arr[min]=temp;
	}

//-------------------------------------------------------------------------------------------
	for(i=0;i<n;i++)
	{
		printf("%d\n",arr[i]);				//Output of Sorted Array
	}
}
