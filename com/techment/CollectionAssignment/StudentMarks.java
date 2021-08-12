package com.techment.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students");
		int num = scanner.nextInt();
		ArrayList<Double> marks = new ArrayList<Double>();
		System.out.println("Enter marks");
		while(scanner.hasNextDouble())
		{
			marks.add(scanner.nextDouble());
		}
		System.out.println(marks);
		Double a[];
		a=new Double[num];
		for(int i=0; i<num; i++)
		{
           a[i]=marks.get(i);
	
		}
        System.out.println("highest marks "+a[num-1]);
        
        int count = 0;
        for(int j=0; j<num; j++)
        {
        	count+=a[j];
        }
        float average = count/num;
        System.out.println("average marks "+average);
        System.out.println("3rd student marks "+a[2]);
		Collections.sort(marks);
		System.out.println("sorted marks "+marks);
	
	scanner.close();
		}

}
