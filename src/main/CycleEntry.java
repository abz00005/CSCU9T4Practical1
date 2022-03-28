package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry{
	
	
	private String cyleTrackType;
	private String difficulty;
	
	


	public CycleEntry(String n, int d, int m, int y, int h, 
			int min, int s, float dist,String cyleTrackType, String difficulty) {
		super(n, d, m, y, h, min, s, dist);
		this.cyleTrackType=cyleTrackType;
		this.difficulty=difficulty;
	}
	
	
	public String getCyleTrackType() {
		return cyleTrackType;
	}


	public void setCyleTrackType(String cyleTrackType) {
		this.cyleTrackType = cyleTrackType;
	}
	
	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	  @Override
	  public String getEntry () {
		   return getName()+" cycled " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+" on "+getCyleTrackType()+" at "+getDifficulty()+" tempo"+"\n";
		  }

	

}
