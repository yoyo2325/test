import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete{

	public Racer(int y) {
		super (1,y,4,Display.INFINITY);
	}
	public void jumpRight() {
		turnLeft();
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnLeft();
	}
	public void sprint(int x) {
		for(int i=0;i<x;i++) {
			move();
		}
	}
	public void put(int x) {
		for(int i=0;i<x;i++) {
			putBeeper();
		}
	}
	public void pick(int x) {
		for(int i=0;i<x;i++) {
			pickBeeper();
		}
	}

}
