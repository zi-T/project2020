package tao.PART1;

public abstract class Stormtrooper extends ImperialTrooper implements Tactical{
	private String STID;
	
	public Stormtrooper(String iDNumber, String STID) {
		super(iDNumber);
		this.STID = STID;
	}


	public abstract void displayTrooper();


	public String getSTID() {
		return STID;
	}


	public void setSTID(String sTID) {
		STID = sTID;
	}


	@Override
	public void move() {
		System.out.println(this.getIDNumber()+" is moving");
	}
	
	
}
