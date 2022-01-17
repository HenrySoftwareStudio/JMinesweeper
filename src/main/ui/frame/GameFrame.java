package main.ui.frame;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import main.env.Values;

import static main.env.Behavior.GameFrame.*;

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
		this.setVisible(true);
		this.setDefaultCloseOperation(closingBehavior);
		
		Values.self = this;
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
