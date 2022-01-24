package main.ui.menubar;

import javax.swing.JMenuBar;

import main.ui.menubar.items.GameMenu;

public class GameMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4685642562189945897L;

	public GameMenuBar() {
		this.add(new GameMenu());
	}

}
