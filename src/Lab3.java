import edu.fcps.karel2.Display;

public class Lab3 {

	public static void main(String[] args) {
		Display.openWorld("maps/mountain.map");
		Climber a1 = new Climber();
		a1.climbUpRight();

	}

}
