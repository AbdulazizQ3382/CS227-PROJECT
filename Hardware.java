
package csc227Project;

import java.util.*;

public class Hardware {
	public static int ram = 680;
	public LinkedList<process> processes;
	public OS os;

	public Hardware() {
		processes = new LinkedList<process>();
	}

	public void addToJobScheduler(process p) { // adding processes to the job scheduler
		if (processes.size() == 0) { // number of elements
			processes.addFirst(p);
			ram -= p.memoryUsed;
		}

		else if(ram>=p.memoryUsed) {
			for (int i = 0; i < processes.size(); i++) { // adding processes in order by putting the least CPU burst in
															// the head and so on .
				if (processes.get(i).cpuBurst > p.cpuBurst) {
					processes.add(i, p);
					ram -= p.memoryUsed;
					p.state.setReady();
					break;
				} else if (i == processes.size()-1) {
					processes.addLast(p);
					ram -= p.memoryUsed;
					p.state.setReady();
					break;
				}
			}

		}else {
			System.out.println("memory is full");
			p.state.setWait();
			p.numWaitMem++;
		}

	}



}
