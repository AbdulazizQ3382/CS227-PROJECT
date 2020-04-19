package csc227Project;
import java.io.*;
import java.util.*;

public class MainProgram {

	public static void main(String args[]) throws FileNotFoundException {
		int timeTerminated=0;
		LinkedList<process> readyQueue2=new LinkedList<process>();
	    process pro[]=new process[5];
		for(int i=0; i<5;i++)
	    	pro[i]=new process(i);
		Hardware h = new Hardware();
		for(int i=0;i<5;i++)
			h.addToJobScheduler(pro[i]);
		System.out.println(h.processes.size());
		OS os = new OS(h);
			int counter=0;
		
		while(true) {
			
			if(counter<h.processes.size()) {
			    readyQueue2.add(h.processes.get(counter));
				readyQueue2.get(counter).clock++;
				 process min = readyQueue2.get(0);
				 if(counter>0) {
					 for(int i=0;i<readyQueue2.size();i++)
						 if(readyQueue2.get(i).cpuBurst<min.cpuBurst)
							 
							 min=readyQueue2.get(i);
					         min.numTimeCpu++;
					 
					 
				 }
			//cpu burst 
		    	min.state.setRun();
				 min.cpuBurst--;
				
				 for(int i=0;i<readyQueue2.size();i++)
					 if(readyQueue2.get(i).cpuBurst==0) {
						 timeTerminated=os.timeTerminatedOrKilled(readyQueue2.get(i));
						 readyQueue2.remove(i); 
					 } 
				 if(counter<readyQueue2.size()-1)
				    counter++;
				 if(readyQueue2.isEmpty())
					 break;
				
						try {
						 FileWriter fw=new FileWriter(new File("Allprocesses.txt"));
						 PrintWriter pw=new PrintWriter(fw);
							 pw.println("process id :"+" "+min.processId+"\n"+"process loaded at: "+" "+counter+"\n"+" Number of time it was in the cpu :"+" "+min.numTimeCpu);
						pw.close();
						}catch (Exception e) {System.out.println("File not found!");}
						
					 }

		}
	
		    }
		    
		    
				
		}
		

	


