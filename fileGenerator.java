package csc227Project;

import java.io.*;
import java.util.Scanner;

public class fileGenerator {

	//random cpu time 
 public int cpuTime() 
 {
	 double y=(Math.random() * 90 + 10);
	 
		int x=(int)y;
		
	 return x;
 }
 //random memory size
 public int memSpace() 
 {
	 double y=(Math.random() * 195 + 5);
	 
		int x=(int)y;
	 
	 return x;
 }
 // random io time
 public int  ioTime() {
	 double y=(Math.random() * 40 + 20);
	 
		int x=(int)y;
	 
	 return x;
	 
 }
 //random arrival time
 public int arrvTime() {
	 double y=(Math.random() * 79  + 1);
	 
		int x=(int)y;
	 
	 return x;
	 
 }

//generate a file with 50 lines of random values 
 public void generateFile() throws IOException {
	try {
	 FileWriter fw=new FileWriter(new File("processes12.txt"));
	 PrintWriter pw=new PrintWriter(fw);
	 for(int i=0;i<50;i++)
		 pw.println(cpuTime()+" "+memSpace()+" "+ioTime()+" "+arrvTime());
	pw.close();
	}catch (Exception e) {System.out.println("File not found!");}
 }

 
 //takes a random values from a random line and return them to an array of 4
 public int[] generateValues() throws FileNotFoundException {
	 int[] result=new int[4];
	 try{
		 Scanner s=new Scanner(new File("processes12.txt"));
		 double y=(Math.random() * (((49) - 0) + 1)) + 0;
			int x=(int)y;
			for(int i=0;i<x;i++) {
				s.next();
				s.next();
				s.next();
				s.next();
			}
			String str=null;
			
			for(int i=0,j=0;i<4;i++) {
				
				
				 str=s.next();
					result[j++]=Integer.parseInt(str);
					
				
				
				
			}
			s.close();
		 
	 }catch(Exception e) {System.err.println("file not found");}
	return result;
	 
 }
}
