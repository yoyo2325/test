
public class Climber extends Athlete {

	public Climber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Climber(int x) {
		super(x, 1, 1, 1	);
		// TODO Auto-generated constructor stub
	}
	public void climbUpRight() {
		turnLeft();
		move();
		move();
		turnRight();
		move();
	}
	public void climbUpLeft() {
		turnRight();
		move();
		move();
		turnLeft();
		move();
	}
	public void climbDownLeft() {
		move();
		turnLeft();
		move();
		move();
		turnRight();
		
	}
	public void climbDownRight() {
		move();
		turnRight();
		move();
		move();
		turnLeft();
		
	}
	
}
