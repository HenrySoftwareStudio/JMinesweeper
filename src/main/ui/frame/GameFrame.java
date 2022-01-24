package main.ui.frame;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

import main.env.DefaultValues;
import main.env.Values;
import main.objs.events.senders.OnBecomeVisibleSender;
import main.ui.menubar.GameMenuBar;
import main.ui.setup.SetupPanel;

public class GameFrame extends JFrame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3691085615510611440L;

	public GameFrame() throws HeadlessException {
		this(null, null);
	}

	public GameFrame(GraphicsConfiguration gc) {
		this(null, gc);
		
	}

	public GameFrame(String title) throws HeadlessException {
		this(title, null);
	}

	public GameFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		setup();
	}
	
	private void setup() {
		this.setDefaultCloseOperation(DefaultValues.CLOSINGBEHAVIOR);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(DefaultValues.MINDIMENSION);
		this.setJMenuBar(new GameMenuBar());
		this.setView(new SetupPanel());
		this.setVisible(true);
		Values.self = this;
	}
	
	@Override
	public void setVisible(boolean b) {
		super.setVisible(b);
		if (b) {
			OnBecomeVisibleSender.onEvent();
		}
	}
	
	public void setView(JComponent o) {
		removeAllUnderHead();
		add(o);
		repaint();
	}
	
	public void removeAllUnderHead() {
		this.getContentPane().removeAll();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
