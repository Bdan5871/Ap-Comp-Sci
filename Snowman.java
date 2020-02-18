
public class Snowman 
{
	private String typeOfHat;
	private String name;
	private int numButtons;
	private int numSegments;
	
	public Snowman()
	{
		typeOfHat = "top hat";
		name = "john doe";
		numButtons = 3;
		numSegments = 3;
	}
	public Snowman(String name)
	{
		this.name = name;
		name = "john doe";
		numButtons = 3;
		numSegments = 3;
	}
	
	public String getHat()
	{
		return typeOfHat;
	}
	public String getName()
	{
		return name;
	}
	public int getButtons()
	{
		return numButtons;
	}
	public int getSegments()
	{
		return numSegments;
	}
	public void setHat(String hat)
	{
		typeOfHat = hat;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSegments(int numSegments)
	{
		this.numSegments = numSegments;
	}
	public void setButtons(int numButtons)
	{
		this.numButtons = numButtons;
	}
	public String toString()
	{
		return "Name: " + name + "\nType of Hat: " + typeOfHat + "\nNumber of Segments: " + numSegments + "\nNUmber of Buttons: " + numButtons;
	}
}