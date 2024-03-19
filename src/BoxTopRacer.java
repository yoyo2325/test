
public class BoxTopRacer extends Racer {

	public BoxTopRacer(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}

	public void jumpRight() {
		turnLeft();
		while(rightIsClear()==false) {
			move();
		}
		turnRight();
		move();
		while(rightIsClear()==false) {
			move();
		}
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		
		
		
		
		
	}

}
