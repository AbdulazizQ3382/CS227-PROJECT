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
	public int ioBurst; // performing an io
	public int requestIo; 
	public int numReqIo;
	public int totalTimeIoBurst;
	public int numTimeCpu;
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
		requestIo=setIOReq();
	}
	

public int setIOReq() {
	double m = Math.random();
	int n = 0;
	if (m >= 0 && m < 0.2) {
		n = 0;
	} else if (m >= 0.2 && m < 0.4) {
		n = 1;
	} else if (m >= 0.4 && m < 0.6) {
		n = 2;
	} else if (m >= 0.6 && m < 0.8) {
		n = 3;
	} else if (m >= 0.8 && m < 0.9) {
		n = 4;
	} else if (m >= 0.9 && m <= 1) {
		n = 5;
	}
	return n;
}

}
