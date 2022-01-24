package main.ui.menubar.items.items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JMenuItem;

import main.env.DefaultValues;
import main.env.Values;
import main.ui.game.GamePanel;
import main.ui.setup.SetupPanel;

public class GameMenuItem extends JMenuItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5075504611223153223L;

	public enum Item {
		RESTART,
		NEWGAME;
	}

	private GameMenuItem(String text) {
		this(text,null);
	}

	private GameMenuItem(String text, Icon icon) {
		super(text, icon);
	}
	
	public static GameMenuItem make(Item item) {
		switch (item) {
		case RESTART:
			GameMenuItem gmi = new GameMenuItem(DefaultValues.GAMERESTARTENG);
			gmi.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Values.self.setView(new GamePanel());
				}
			});
			return gmi;
		case NEWGAME:
			GameMenuItem gmi2 = new GameMenuItem(DefaultValues.NEWGAMEENG);
			gmi2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Values.self.setView(new SetupPanel());
				}
			});
			return gmi2;
		
		default:
			return null;
		}
	}
}
