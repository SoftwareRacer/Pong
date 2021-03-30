import javax.swing.*;

public class Gui {
	
	public Gui() {		
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenWidth, Var.screenHeight);
		Var.jf1.setTitle("Pong");
		Var.jf1.setDefaultCloseOperation(Var.jf1.EXIT_ON_CLOSE);
		Var.jf1.setLayout(null);
		Var.jf1.setResizable(false);
		Var.jf1.setVisible(true);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus();
		
		/*Draw_Game lblDraw = new Draw_Game();
		lblDraw.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
		lblDraw.setVisible(true);
		Var.jf1.add(lblDraw);*/
		Draw_Menu lblMenu = new Draw_Menu();
		lblMenu.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
		lblMenu.setVisible(true);
		Var.jf1.add(lblMenu);
	}
}
