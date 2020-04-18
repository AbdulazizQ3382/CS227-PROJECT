package csc227Project;
import java.io.*;

public class process {
	public int clock ; 
	public int processId;
	public int arrivalTime;
	public int totalTime;
	public State state;
	public int memoryUsed;
	public int cpuBurst;
	public int numWaitMem;  // number of times waiting for a size
	public int ioBurst;
	public process(int id) throws FileNotFoundException{
		clock=0;
		state = new State();
		fileGenerator fg=new fileGenerator();//taking values from file.
		this.processId=id;
		totalTime=0;
		int[] info=fg.generateValues();
		arrivalTime=info[3];
		memoryUsed=info[1];
		cpuBurst=info[0];
		ioBurst=info[2];
		numWaitMem=0;
	}

}
