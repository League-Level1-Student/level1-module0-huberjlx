package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.*;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		rob.setX(75);
		rob.setY(500);
		rob.miniaturize();
		rob.setSpeed(50);
		for (int i = 0; i < 10; i++) {
			Random ran = new Random();
			int randomNum = ran.nextInt(3);
			if (randomNum == 0) {
				pointedRoof("small", Color.blue);
				
			}
			else if (randomNum == 1) {
				pointedRoof("medium", Color.gray);	
			} else {
				moreHouses("large", Color.cyan);
			}
		}
	}
	
	public void moreHouses(String height, Color houseColor) {
		
		int houseHeight = 0;
		if (height.equalsIgnoreCase("small")) {
			houseHeight = 60;	
		}
		else if (height.equalsIgnoreCase("medium")) {
			houseHeight = 120;
		} else {
			houseHeight = 250;
		}
		
		rob.setPenColor(houseColor);
		rob.penDown();
		rob.move(houseHeight);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(houseHeight);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(20);
		rob.turn(-90);
	}
	
	public void pointedRoof (String height, Color houseColor) {
		
		int houseHeight = 0;
		if (height.equalsIgnoreCase("small")) {
			houseHeight = 60;	
		}
		else if (height.equalsIgnoreCase("medium")) {
			houseHeight = 120;
		} else {
			houseHeight = 250;
		}
		
		rob.setPenColor(houseColor);
		rob.penDown();
		rob.move(houseHeight);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(houseHeight);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(20);
		rob.turn(-90);
	}

}
