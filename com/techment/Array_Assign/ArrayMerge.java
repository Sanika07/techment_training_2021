package Array_Assign;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of 1st array:  ");
		int arrayFirst = scanner.nextInt();
		System.out.println("================================================");
		System.out.println("Size of 1st array: "+arrayFirst);
		System.out.println("================================================");
		int arrayA[] = new int[arrayFirst];
		
		Scanner scanValue = new Scanner(System.in);
		System.out.print("Enter the value for first array: ");
		for(int i=0;i<arrayFirst;i++)
		{	System.out.print("Enter the value for index ["+i+"] : ");
		arrayA[i] = scanValue.nextInt();
		}
				
		Scanner scanSecond = new Scanner(System.in);
		System.out.print("Enter the size of 2nd array:  ");
		int arraySecond = scanSecond.nextInt();
		System.out.println("================================================");
		System.out.println("Size of 2nd array: "+arraySecond);
		System.out.println("================================================");
		int arrayB[] = new int[arraySecond];
		
		Scanner scanValue2 = new Scanner(System.in);
		System.out.print("Enter the value for 2nd array: ");
		for(int i=0;i<arrayB.length;i++)
		{	System.out.print("Enter the value for index ["+i+"] = ");
		arrayB[i] = scanValue2.nextInt();
		}
		
		System.out.println("================================================");
		for(int j=0;j<arrayFirst;j++)
		{	System.out.println("value of index ["+j+"] is = "+arrayA[j]);
			
		}
		System.out.println("================================================");
		for(int j=0;j<arraySecond;j++)
		{	System.out.println("value of index ["+j+"] is = "+arrayB[j]);
			
		}
		int arrayC[] = new int[arrayFirst+arraySecond];
		
		for(int i=0;i<arrayFirst;i++)
		{	arrayC[i]= arrayA[i];
		}
		
		for(int l=0;l<arraySecond;l++)
		{	arrayC[arrayFirst+l]= arrayB[l];
		}
		
		System.out.println("======The array after merge===================");
		for(int j=0;j<(arrayFirst+arraySecond);j++)
		{	System.out.println("value of index ["+j+"] is = "+arrayC[j]);
		}
		
		for(int m=0;m<arrayC.length-1;m++)
		{
			for(int k=0;k<arrayC.length-1;k++)
			{	if(arrayC[k]> arrayC[k+1])
				{int	temp = arrayC[k];
				arrayC[k]= arrayC[k+1];
				arrayC[k+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting ");
		
		for(int l=0;l<arrayC.length;l++)
		{	System.out.println("value of index ["+l+"] is = "+arrayC[l]);
		}
	}

}
