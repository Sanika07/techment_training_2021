package CodingPracticeTest01;

import java.util.Scanner;

public class AgeProb {

	public static void main(String[] args) {
		int n,kids=0, adult=0, seniors=0;
		int[] array1 = new int[15];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No. of element in array");
		n=scanner.nextInt();
		
		System.out.println("Enter first array elelment ");
		for(int i=0;i<n;i++) {    //taking i/p from user to array1
			array1[i]=scanner.nextInt();	
		}
for (int i=0;i<n;i++)
{
	if(array1[i]<18)
		kids++;
	else if(array1[i]>=18 && array1[i]<54)
		adult++;
	else if(array1[i]>=55)
		seniors++;
}
	System.out.println("Children:" + kids); 
	System.out.println("Adults:" + adult); 
	System.out.println("Senior Citizens:" + seniors); 
scanner.close();
	}

}
