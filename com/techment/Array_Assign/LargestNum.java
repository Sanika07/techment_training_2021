package Array_Assign;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0,temp=0,count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of subjects:  ");
		int number = scanner.nextInt();
		System.out.println("Total no. of subjects: "+number);
		
		int marks[] = new int[number];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.println("Enter the marks for subject: "+(i+1));
			marks[i] = sc.nextInt();
		}
		
		for(int j=0;j<number;j++)
		{	System.out.println("Marks of subject "+(j+1)+" is: "+marks[j]);
			sum+=marks[j];
		}
	
		System.out.println("Sum of all subject marks is: "+sum);
		
		for(int m=0;m<marks.length-1;m++)
		{
			for(int k=0;k<marks.length-1;k++)
			{	if(marks[k]< marks[k+1])
				{	temp = marks[k];
					marks[k]= marks[k+1];
					marks[k+1] = temp;
				}
			}
		}

		System.out.println("Highest marks = "+marks[0]);
		System.out.println("Second Highest marks = "+marks[1]);
		System.out.println("Lowest marks  = "+marks[number-1]);
		System.out.println("Second Lowest second marks  = "+marks[number-2]);
	}

}
