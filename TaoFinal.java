package tao.MAIN;

import java.io.IOException;
import java.util.ArrayList;

import tao.PART1.*;
import tao.PART2.Part2;

public class TaoFinal {
	public static void main(String[] args) throws IOException {
		Assaulttrooper A = new Assaulttrooper("ASLT-1","A-001");
		A.displayTrooper();
		A.move();
		ArrayList<Scouttrooper> S = Part2.buildScouts(3);
		Part2.compareTroopers(S.get(0), S.get(1));
		Part2.writeScoutDataToFile(S);
		System.out.println();
		String s = "/Users/sunnytao/Desktop/NYU_Yr1/Spring/CS_Java/assignments/Tao_FinalS2021_V1/src/tao/PART2/STData";
		Part2.writeScoutDataToConsole(s);
	}
}
