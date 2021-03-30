import java.awt.*;

import javax.swing.*;

public class Draw_Game extends JLabel{
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
				
		g.setColor(Color.BLACK);
		g.fillRect(0,  0,  Var.screenWidth, Var.screenHeight);
		
		g.setColor(Color.WHITE);
		
		for(int i = 0; i < 30; i++) {
			g.fillRect(Var.screenWidth / 2 - 5, i * 20, 5, 10);
		}
		
		g.fillRect(Var.x, Var.y, 25, 150);		
		g.fillRect(Var.gegnerx, Var.gegnery, 25, 150);
		
		g.setFont(Var.pixelFont);
		g.drawString("" + Var.playerScore, Var.screenWidth / 2 - 95, 75);
		g.drawString("" + Var.gegnerScore, Var.screenWidth / 2 + 40, 75);
		
		g.fillRect(Var.ballx, Var.bally, 20, 20);
		
		repaint();
	}
}
