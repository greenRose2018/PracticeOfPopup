package view;

import javax.swing.JOptionPane;

public class PopupDisplay 
{
	public void display(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}
	
	public String getInput(String response)
	{
		String input = "";
		
		input += JOptionPane.showInputDialog(null, response);
		
		return input;
	}
}
