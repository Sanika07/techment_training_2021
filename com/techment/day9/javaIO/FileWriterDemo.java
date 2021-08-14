package com.techment.day9.javaIO;

import java.io.*;
public class FileWriterDemo 
{
	public static void main(String[] args)throws IOException 
	{
		FileWriter fw=new FileWriter("cricket.txt",true);
		fw.write(98);//adding a single character
		fw.write("haskar\nsoftware solutions");
		fw.write("\n");
		char[] ch={'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
	}
}

