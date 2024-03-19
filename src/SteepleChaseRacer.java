
public class SteepleChaseRacer extends Racer {

	public SteepleChaseRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}
	public void jumpRight() {
		turnLeft();
		move();
		move();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
		move();
		move();
		move();
		move();
		move();
		turnLeft();
	}
	

}
