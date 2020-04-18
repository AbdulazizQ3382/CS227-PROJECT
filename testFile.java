package csc227Project;
import java.io.IOException;
import java.util.PriorityQueue;

public class testFile {
	//main used for testing fileGenerator class also if you want to change the file values or if the file doesn't exist
public static void main(String[] args) throws IOException {
	fileGenerator fg=new fileGenerator();
	fg.generateFile();
	int[] a=fg.generateValues();
	
	for (int i=0;i<a.length;i++)
		System.out.println(a[i]);

	
}
	
}
