package tao.PART1;

public class Scouttrooper extends Stormtrooper{

	public static String Type = "Scout";
	
	public Scouttrooper(String iDNumber, String STID) {
		super(iDNumber, STID);
	}

	@Override
	public void displayTrooper() {
		System.out.println("I am a " + Type + "trooper\n"
				+ "My ID Number is " + this.getIDNumber() + "\n"
				+ "My STID is " + this.getSTID());
	}

}
