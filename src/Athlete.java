import edu.fcps.karel2.Robot;

public class Athlete extends Robot {

	public Athlete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Athlete(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}	
