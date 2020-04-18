package csc227Project;

public class OS {
	public Hardware h;

	public OS(Hardware h) {
		this.h = h;
	}

	public int checkNewProcess() {
		int max=0;
		process maxp = h.processes.get(0);
		for(int i=0;i<h.processes.size();i++) {
			if(h.processes.get(i).processOrder>max) {
				max=h.processes.get(i).processOrder;
			    maxp=h.processes.get(i);
			}
		}
	return maxp.processId;
}
}


