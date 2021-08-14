package Array_Assign;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Total count of numbers:  ");
		int number = scanner.nextInt();
		System.out.println("Enter total number: "+number);
		int arrayA[] = new int[number];
		
		Scanner scanValue = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the value for index ["+i+"] : ");
		arrayA[i] = scanValue.nextInt();
		}
		for(int j=0;j<number;j++)
		{	System.out.println("value of index ["+j+"] is: "+arrayA[j]);
			
		}
		
		

		
		for(int m=0;m<arrayA.length-1;m++)
		{
			for(int k=0;k<arrayA.length-1;k++)
			{	if(arrayA[k]> arrayA[k+1])
				{int	temp = arrayA[k];
				arrayA[k]= arrayA[k+1];
				arrayA[k+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting ");
		
		for(int l=0;l<arrayA.length;l++)
		{	System.out.println("value of index ["+l+"] is = "+arrayA[l]);
		}
	}

}
