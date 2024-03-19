import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab10 {

	public static void main(String[] args) {

		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("maps/"+filename+".map");
		Display.setSpeed(10);
		Athlete a1= new Athlete(1, 1, 4, 1000);
		boolean pickstate=false;
		
		while(!a1.nextToABeeper()) {
			//左轉
			if(!(a1.rightIsClear())&&!(a1.nextToABeeper())) {
				if(!(a1.frontIsClear())) {
					
					a1.turnLeft();
					
					//死路迴轉 撿東西
					if(!(a1.frontIsClear())&& ! (a1.rightIsClear())) {
						a1.turnLeft();
						pickstate=true;
						a1.putBeeper();
						
						
						//pick-----------------------------------------------------------------
						while(a1.nextToABeeper()&&pickstate) {
							if(!(a1.rightIsClear()) && (a1.nextToABeeper())) { 
								if(!(a1.frontIsClear())) {
									a1.turnLeft();
								}
								

							}
							else {
								a1.turnRight();
							}
							
							a1.pickBeeper();
							a1.move();
							
						}
						//pick-----------------------------------------------------------------
						//多撿的放回去
						if(pickstate){
							
								a1.turnAround();
								a1.move();
								a1.putBeeper();
								a1.turnAround();
								a1.move();
								
							
						}
					}
				}
				//直走
				
			if(!pickstate&& !(a1.nextToABeeper())&&(!a1.rightIsClear())) {
					
					a1.putBeeper();
					a1.move();
					
					
				}
				pickstate=false;
			}
		
			
			else if(a1.rightIsClear()){
				a1.turnRight();
				a1.putBeeper();
				a1.move();
				
				
			}
			if(a1.nextToABeeper()) {
				//檢查左邊的
				if(a1.leftIsClear()) {
					
					a1.turnLeft();
					a1.move();
					if(a1.nextToABeeper()) {
						pickstate=true;
						while(a1.nextToABeeper()&&pickstate) {
							if(!(a1.rightIsClear()) && (a1.nextToABeeper())) { 
								if(!(a1.frontIsClear())) {
									a1.turnLeft();
								}
								a1.pickBeeper();
								a1.move();

							}
							else {
								a1.turnRight();
								
								a1.pickBeeper();
								a1.move();
								
								
			
							}
							
						}
						//pick-----------------------------------------------------------------
						//多撿的放回去
						if(pickstate){
							
								a1.turnAround();
								a1.move();
								a1.putBeeper();
								a1.turnAround();
								a1.move();
								
							
						}
						pickstate=false;
					}
					else {
						break;
					}
				}

				
				
				
			}
			
		
			
				
			}
			
			
		}
		
		

	}


