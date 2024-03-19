import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class lab05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = JOptionPane.showInputDialog("What robot map?"); 
		Display.openWorld("maps/" + filename + ".map"); 
		Racer a1 = new Racer(1);
		//racer a2 = new racer(4);
		//racer a3 = new racer(7);
		while(a1.frontIsClear()) {
			a1.move();
		}
		a1.jumpRight();
		int counter=0;
		while(a1.frontIsClear()||counter<3) {
			if(counter==3) {
				break;
			}
			a1.move();
			if(a1.nextToABeeper()) {
				while(a1.nextToABeeper()) {
					a1.pickBeeper();
				}
				counter++;
			}
			
		}

		
	}
}
