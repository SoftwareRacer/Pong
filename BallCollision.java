import java.util.*;

public class BallCollision {
	Timer move;
	Random rand;

	public BallCollision() {
		move = new Timer();
		rand = new Random();
		move.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				if (Var.bally + 50 >= Var.screenHeight) {
					Var.ballDirY = -1;
				}
				if (Var.bally <= 0) {
					Var.ballDirY = 1;
				}
				if (Var.ballx + 10 >= Var.screenWidth) {
					Var.ballx = Var.screenWidth / 2;
					Var.bally = rand.nextInt(Var.screenHeight);

					Var.playerScore++;
					Var.ballDirX = -1;
				}
				if (Var.ballx - 10 <= 0) {
					Var.ballx = Var.screenWidth / 2;
					Var.bally = rand.nextInt(Var.screenHeight);

					Var.gegnerScore++;
					Var.ballDirX = 1;
				}
				if(Var.ballx < Var.x + 25 && Var.ballx > Var.x && Var.bally < Var.y + 150 && Var.bally > Var.y) {
					Var.ballDirX = 1;
				}
				if(Var.ballx < Var.gegnerx && Var.ballx > Var.gegnerx - 25 && Var.bally < Var.gegnery + 150 && Var.bally > Var.gegnery) {
					Var.ballDirX = -1;
				}
			}
		}, 0, 4);
	}
}
