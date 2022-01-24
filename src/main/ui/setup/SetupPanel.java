package main.ui.setup;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import main.env.DefaultValues;
import main.env.Values;
import main.ui.game.GamePanel;

public class SetupPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -232025097590310238L;

	public SetupPanel() {
		super(true);
		this.setLayout(new GridBagLayout());
		
		JPanel MineField = new JPanel(true);
		JSlider SizeX = new JSlider(2, 64, 8) {
		      /**
			 * 
			 */
			private static final long serialVersionUID = 7452850634699136849L;
			private SliderPopupListener popupHandler;
		      @Override 
		      public void updateUI() {
		    	  removeMouseMotionListener(popupHandler);
		    	  removeMouseListener(popupHandler);
		    	  removeMouseWheelListener(popupHandler);
		    	  super.updateUI();
		    	  popupHandler = new SliderPopupListener();
		    	  addMouseMotionListener(popupHandler);
		    	  addMouseListener(popupHandler);
		    	  addMouseWheelListener(popupHandler);
		      }
		};
		JSlider SizeY = new JSlider(2, 64, 8) {
		      /**
			 * 
			 */
			private static final long serialVersionUID = -6851825154368655541L;
			private SliderPopupListener popupHandler;
		      @Override 
		      public void updateUI() {
		    	  removeMouseMotionListener(popupHandler);
		    	  removeMouseListener(popupHandler);
		    	  removeMouseWheelListener(popupHandler);
		    	  super.updateUI();
		    	  popupHandler = new SliderPopupListener();
		    	  addMouseMotionListener(popupHandler);
		    	  addMouseListener(popupHandler);
		    	  addMouseWheelListener(popupHandler);
		      }
		};
		JPanel Grid = new JPanel(true);
		JLabel InGrid = new JLabel("");
		SizeX.setOrientation(SwingConstants.HORIZONTAL);
		SizeX.setMajorTickSpacing(1);
		SizeX.setPaintTicks(true);
		SizeX.setSnapToTicks(true);
		SizeX.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				GridLayout layout = (GridLayout) Grid.getLayout();
				layout.setColumns(SizeX.getValue());
				fillGird(InGrid, Grid);
				repaint();
			}
		});
		SizeY.setOrientation(SwingConstants.VERTICAL);
		SizeY.setMajorTickSpacing(1);
		SizeY.setPaintTicks(true);
		SizeY.setSnapToTicks(true);
		SizeY.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				GridLayout layout = (GridLayout) Grid.getLayout();
				layout.setRows(SizeY.getValue());
				fillGird(InGrid, Grid);
				repaint();
			}
		});
		InGrid.setBorder(new LineBorder(Color.black));
		MineField.setLayout(new GridBagLayout());
		Grid.setLayout(new GridLayout(8, 8));
		fillGird(InGrid, Grid);
		MineField.add(Grid, new GridBagConstraints(1, 1, 1, 1, 0.85, 0.90, GridBagConstraints.NORTHWEST, 0, new Insets(0, 0, 0, 0), 0, 0));
		MineField.add(SizeY, new GridBagConstraints(2, 1, 1, 1, 0.15, 0.90, GridBagConstraints.NORTHWEST, 0, new Insets(0, 0, 0, 0), 0, 0));
		MineField.add(SizeX, new GridBagConstraints(1, 2, 1, 1, 0.85, 0.10, GridBagConstraints.NORTHWEST, 0, new Insets(0, 0, 0, 0), 0, 0));
		
		JButton StartGame = new JButton(DefaultValues.STARTGAMEENG);
		StartGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Values.self.setView(new GamePanel(SizeX.getValue(), SizeY.getValue()));				
			}
		});
		
		this.add(MineField, new GridBagConstraints(1, 1, 1, 1, 1.00, 0.90, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));
		this.add(StartGame, new GridBagConstraints(1, 2, 1, 1, 1.00, 0.10, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));
	}
	
	private void fillGird(JLabel source, JPanel target) {
		GridLayout layout = (GridLayout) target.getLayout();
		for(int y = 0; y < layout.getRows(); y++) {
			for(int x = 0; x < layout.getColumns(); x++) {
				target.add(source);
			}
		}
		this.repaint();
	}
}
