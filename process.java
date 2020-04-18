package csc227Project;
import java.io.*;

public class process {
	public int clock ; 
	public int processId;
	public int processOrder;
	public int arrivalTime;
	public int totalTime;
	public State state;
	public int memoryUsed;
	public int cpuBurst;
	public int numWaitMem;  // number of times waiting for a size
	public int ioBurst;
	public boolean requestIo; 
	public int numReqIo;
	public int totalTimeIoBurst;
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
		requestIo=randomeReq();
	}
	public boolean randomeReq() {
//	boolean arrBool[]= {true,false};
//		double req=Math.random()*1+0;
//		int reqInt=(int)req;
//		return arrBool[reqInt];
	double m = Math.random();
	boolean b = true;
		if (m > 0 && m <= 0.5) {
			b = true;
		return b;
	} else {
		return false;
		}
	}

}
