package tao.PART2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import tao.PART1.*;

public class Part2 {
	public static ArrayList<Scouttrooper> buildScouts(int n){
		ArrayList<Scouttrooper> trooperList = new ArrayList<>();
		for(int i = 1; i < n+1; i++) {
			trooperList.add(new Scouttrooper("ST"+i,"S-00"+i));
		}
		return trooperList;
	}
	
	public static boolean compareTroopers(Stormtrooper st1,Stormtrooper st2) {
		if(st1.getSTID().equals(st2.getSTID())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void writeScoutDataToFile(ArrayList<Scouttrooper> trooperList) throws IOException{
		String DIR = "/Users/sunnytao/Desktop/NYU_Yr1/Spring/CS_Java/assignments/Tao_FinalS2021_V1/src/tao/PART2/STData";
		BufferedWriter BW = new BufferedWriter(new FileWriter(DIR));
		for(Scouttrooper sct : trooperList) {
			BW.write("Scout " + sct.getIDNumber() + " " + sct.getSTID()+"\n");
		}
		BW.close();
	}
	
	public static void writeScoutDataToConsole(String s) throws IOException{
		BufferedReader BR = new BufferedReader(new FileReader(s));
		String line;
		while((line = BR.readLine()) != null) {
			System.out.print(line + "...	");
		}
		BR.close();
	}
}
