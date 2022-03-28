package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry{
	private int laps;
	private int recoveryTime;

	public SprintEntry(String n, int d, int m, int y, int h,
			int min, int s, float dist, int recoveryTime, int laps) {
		super(n, d, m, y, h, min, s, dist);
		this.laps = laps;
		this.recoveryTime = recoveryTime;
	}

	public int getLaps() {
		return laps;
	}

	public int getRecoveryTime() {
		return recoveryTime;
	}
	@Override
	public String getEntry() {
		return getName()+" sprinted " + getLaps()+"x"+ getDistance() + " m in "
				+getHour()+":"+getMin()+":"+ getSec() + " with "+getRecoveryTime()+" minutes recovery"+ " on "
				+getDay()+"/"+getMonth()+"/"+getYear()+"\n";
	}

}
