import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Var {

	static JFrame jf1;
	static int screenWidth = 800, screenHeight = 600;
	
	static int x = 20, y = 185;
	static int gegnerx = screenWidth - 45, gegnery = 185;
	static boolean moveUp = false, moveDown = false;
	static int ballx = 200, bally = 200;
	
	static int playerScore = 0, gegnerScore = 0;
	
	static Font pixelFont;
	
	static int ballDirX = 1, ballDirY = -1;
	
	public Var() {
		try {
			pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File("Squarely.ttf")).deriveFont(125f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Squarely.ttf")));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
