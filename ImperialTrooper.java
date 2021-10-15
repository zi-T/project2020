package tao.PART1;

import java.io.Serializable;

public abstract class ImperialTrooper implements Serializable{
	private String IDNumber;

	public ImperialTrooper(String iDNumber) {
		this.IDNumber = iDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	
}
