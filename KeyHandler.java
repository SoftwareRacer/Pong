import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveUp = true;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.moveDown = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveUp = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.moveDown = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
