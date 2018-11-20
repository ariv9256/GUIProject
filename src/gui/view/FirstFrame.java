package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	private GUIController appController;
	private FirstPanel appPanel;
	
	public FirstFrame()
	{
		super();
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		
		setUpFrame();
		
	}
	private void setUpFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My first GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}
