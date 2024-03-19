import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class lab09 {

	public static void main(String[] args) {
		 String filename = JOptionPane.showInputDialog("What robot world?");
		 Display.openWorld("maps/"+filename+".map");
		 Athlete a1 = new Athlete(1,1,4,100);
		 int counter=0;
		 int tmp=0;
		 for(int i=0;i<9;i++) {
			 
			 
			 if(a1.nextToABeeper()) {
				 while(a1.nextToABeeper()) {
					 a1.pickBeeper();
					 ++counter;
				 }
			 }
			 for(int j=0;j<tmp;j++) {
				 a1.putBeeper();
			 }
			 
			 
			 tmp=counter;
			 counter=0;
			 a1.move();
			 
		 }

	}

}
