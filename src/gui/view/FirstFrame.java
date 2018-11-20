package gui.view;

import javax.swing.JFrame;

public class FirstFrame extends JFrame
{
	public FirstFrame()
	{
		super();
	}
	private void setUpFrame()
	{
		this.setSize(800, 800);
		this.setTitle("My first GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}
