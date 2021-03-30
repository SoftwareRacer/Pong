import java.util.*;

public class BallMovement {
	Timer move;
	
	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				Var.ballx += Var.ballDirX;
				Var.bally += Var.ballDirY;
			}
		}, 0, 4);
	}
}
