package controller;

import view.PopupDisplay;
import model.Colors;

public class Controller 
{
	//Data members
	private PopupDisplay popup;
	private Colors color;
	
	public Controller()
	{
		popup = new PopupDisplay();
		color = new Colors("blue","bob", false,5);
		
	}
	public void start()
	{
		popup.display("Hello");
		
		popup.display(color.toString());
	}
}
