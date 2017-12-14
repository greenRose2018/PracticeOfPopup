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
	public String getColor()
	{
		return color;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getIsNot()
	{
		return isNot;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setIsNot(boolean isNot)
	{
		this.isNot = isNot;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public String toString()
	{
		String response = "";
		response += "Hello my name is " + getName() + ". \n" + "I am the color " + getColor() + ". \n";
		response += "I am " + getNumber() + " years old.\n";
		return response;
		
	}
}
