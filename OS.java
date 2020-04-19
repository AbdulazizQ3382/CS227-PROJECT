package csc227Project;

public  class OS {
	public static Hardware h;

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
	public process[] sjf() {
		process sjf[]=new process[h.numProcess];
		for(int i=0;i<h.numProcess;i++) {
			sjf[i]=h.processes.get(i);
			timeLoadedInReadyQueue(sjf[i]);
		}
	   return sjf;
	}
	
	public int timeTerminatedOrKilled(process p) {
		if(p.state.terminate==true || p.state.kill==true)
			return p.clock;
		else
			return 0 ;
	}
	public boolean isTerminated(process p) {
		return p.state.terminate==true;
	}
	public boolean isKilld(process p) {
		return p.state.kill==true;
	}
		
    public int timeLoadedInReadyQueue(process p) {
    	return p.clock;
    	
    }
    // true if p1 is smaller than p2
    public boolean checkBurst(process p1 , process p2) {
    	if(p1.cpuBurst<p2.cpuBurst)
    		return true;
    	else
    		return false;
    }
		
	

//	
	
}


