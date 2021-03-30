import java.util.*;

public class OpponentMovement {
	Timer move;

	public OpponentMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){
			public void run() {
				if(Var.ballx >= Var.screenWidth/2 + 200) {
					if(Var.bally > Var.gegnery + 75) {
						if(Var.gegnery <= Var.screenHeight - 190) {
							Var.gegnery += 2;
						}
					}
				} else if(Var.bally < Var.gegnery - 75) {
					if(Var.gegnery >= 10) {
						Var.gegnery -= 2;
					} 
				}
			}
		}, 0, 6);
	}
}
