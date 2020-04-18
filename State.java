package csc227Project;

public class State {
	private boolean ready;
	private boolean wait;
	private boolean run;
	private boolean terminate;
	private boolean kill;
	
//	to ensure that a state has only one value true and the rest are false 
	public void setReady() {
		ready=true;
		wait=false;
		run=false;
		terminate=false;
		kill=false;
	}
	public void setWait() {
		ready=false;
		wait=true;
		run=false;
		terminate=false;
		kill=false;
	}
	public void setRun() {
		ready=false;
		wait=false;
		run=true;
		terminate=false;
		kill=false;
	}
	public void setTerminate() {
		ready=false;
		wait=false;
		run=false;
		terminate=true;
		kill=false;
	}
public void setKill() {
	ready=false;
	wait=false;
	run=false;
	terminate=false;
	kill=true;
}
}
