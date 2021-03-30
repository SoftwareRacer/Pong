import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	Timer move;
	
	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				if(Var.moveUp == true) {
					if(Var.y >= 10) {
						Var.y -= 2;
					} 
				}else if(Var.moveDown == true) {
					if(Var.y <= Var.screenHeight - 190) {
						Var.y += 2;
					}
				}
			}
		}, 0, 6);
	}
}
