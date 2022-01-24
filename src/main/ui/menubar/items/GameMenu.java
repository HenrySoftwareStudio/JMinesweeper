package main.ui.menubar.items;

import javax.swing.JMenu;

import main.ui.menubar.items.items.GameMenuItem;
import main.ui.menubar.items.items.GameMenuItem.Item;

public class GameMenu extends JMenu {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6721402162891346392L;

	public GameMenu() {
		super("Game Functions");
		this.add(GameMenuItem.make(Item.NEWGAME));
		this.add(GameMenuItem.make(Item.RESTART));
	}
}
