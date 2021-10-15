package tao.PART1;

public class Assaulttrooper extends Stormtrooper{

	public static String Type = "Assault";
	
	public Assaulttrooper(String iDNumber, String STID) {
		super(iDNumber, STID);
	}

	@Override
	public void displayTrooper() {
		System.out.println("I am a " + Type + "trooper\n"
				+ "My ID Number is " + this.getIDNumber() + "\n"
				+ "My STID is " + this.getSTID());
	}

}
