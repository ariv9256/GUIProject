package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import gui.controller.GUIController;


public class FirstPanel extends JPanel
{
	private GUIController appController;
	private FirstPanel appPanel;
	private JLabel firstLabel;
	private JButton firstButton;
	
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		firstLabel = new JLabel("words in a line!");
		firstButton = new JButton("Click me!!");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
