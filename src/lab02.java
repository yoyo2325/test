import edu.fcps.karel2.Display;


public class lab02 {
	public static void gogo (Athlete args) {
		args.turnAround();
		args.move();
		args.move();
	}
	public static void main(String[] args) {
		Display.openWorld("maps/maze.map");
		Athlete a1 =new Athlete(1,1,1,50);
		a1.putBeeper();
		a1.move();
		a1.putBeeper();
		a1.turnRight();
		a1.move();
		a1.turnAround();
		a1.move();
		gogo(a1);
	}

}
