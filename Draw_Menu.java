import java.awt.*;

import javax.swing.*;

public class Draw_Menu extends JLabel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0,  0,  Var.screenWidth, Var.screenHeight);
		
		g.setColor(Color.WHITE);
		
		
	}
}
