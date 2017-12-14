package controller;

import view.PopupDisplay;

public class Controller 
{
	//Data members
	private PopupDisplay popup;
	
	public Controller()
	{
		popup = new PopupDisplay();
		
	}
	public void start()
	{
		popup.display("Hello");
		
	}
}
