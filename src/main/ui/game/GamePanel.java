package main.ui.game;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8442044660148911829L;
	
	private static int oldX;
	private static int oldY;
	
	public GamePanel() {
		super(true);
		add(new JLabel("test2"));
	}
	
	public GamePanel(int xSize, int ySize) {
		super(true);
		oldX = xSize;
		oldY = ySize;
		add(new JLabel("test2"));
	}
}
