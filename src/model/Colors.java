package model;

public class Colors 
{
	//data members
	private String color;
	private String name;
	private boolean isNot;
	private int number;
	
	
	public Colors()
	{
		//unless we specify values all data members
		//are a zero, false, or null
	}
	public Colors(String color, String nameOfColor, boolean isIt, int howMany)
	{
		this.color = color;
		this.name = nameOfColor;
		this.isNot = isIt;
		this.number = howMany;
	}
