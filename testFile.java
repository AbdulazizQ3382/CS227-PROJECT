package csc227Project;

import java.io.IOException;
import java.util.PriorityQueue;

public class testFile {
	// main used for testing fileGenerator class also if you want to change the file
	// values or if the file doesn't exist
	public static void main(String[] args) throws IOException {

		// testing files
//	fileGenerator fg=new fileGenerator();
//	fg.generateFile();
//	int[] a=fg.generateValues();
//	
//	for (int i=0;i<a.length;i++)
//		System.out.println(a[i]);

//_____________________________________________
// testing the process and hardware classes : 
int counter=0;
		process p = new process(121);
		process p1 = new process(131);
		process p2 = new process(1551);
		process p3 = new process(1771);
		System.out.println(p.cpuBurst);
		System.out.println(p1.cpuBurst);
		System.out.println(p2.cpuBurst);
		System.out.println(p3.cpuBurst);
		Hardware h = new Hardware();
		h.addToJobScheduler(p);
		h.addToJobScheduler(p1);
		h.addToJobScheduler(p2);
		h.addToJobScheduler(p3);

		System.out.println("process: " + h.processes.getFirst().cpuBurst);
		System.out.println("mem: " + h.processes.getFirst().memoryUsed);
		System.out.println("req:" + h.processes.getFirst().requestIo);
		System.out.println("IO burst:" + h.processes.getFirst().ioBurst);
		
		if (h.ram > p1.memoryUsed) {
			System.out.println("process: " + h.processes.get(1).cpuBurst);
			System.out.println("mem: " + h.processes.get(1).memoryUsed);
			System.out.println("req:" + h.processes.get(1).requestIo);
			System.out.println("IO burst:" + h.processes.get(1).ioBurst);
		}
		if (h.ram > p2.memoryUsed) {
			System.out.println("process: " + h.processes.get(2).cpuBurst);
			System.out.println("mem: " + h.processes.get(2).memoryUsed);
			System.out.println("req: " + h.processes.get(2).requestIo);
			System.out.println("IO burst:" + h.processes.get(2).ioBurst);
		}
		if (h.ram > p3.memoryUsed) {
			System.out.println("process: " + h.processes.get(3).cpuBurst);
			System.out.println("mem: " + h.processes.get(3).memoryUsed);
			System.out.println("re: " + h.processes.get(3).requestIo);
			System.out.println("IO burst:" + h.processes.get(3).ioBurst);

		}
		System.out.println(p.processOrder);
		System.out.println(p1.processOrder);
		System.out.println(p2.processOrder);
		System.out.println(p3.processOrder);
		System.out.println(h.processes.size());
		System.out.println(h.ram);
		OS os = new OS(h);
		System.out.println("The new process is "+os.checkNewProcess());

	}

}
