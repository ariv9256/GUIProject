package gui.view;

import javax.swing.*;
import gui.controller.GUIController;


public class FirstPanel extends JPanel
{
	private GUIController appController;
	private FirstPanel appPanel;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		firstLabel = new JLabel("words in a line!");
		firstButton = new JButton("Click me!!");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -90, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -135, SpringLayout.SOUTH, this);
		
	}
	private void setupListeners()
	{
		
	}
}
