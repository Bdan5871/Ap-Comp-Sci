
public class BuildSnowan
{
	public static void main(String[] args)
	{
		Snowman jerry = new Snowman();
		Snowman gary = new Snowman();
		Snowman elim = new Snowman("Elim");
		jerry.setHat("top hat");
		jerry.setSegments(7);
		jerry.setButtons(1);
		jerry.setName("Jerry");
		
		System.out.println(jerry.getName());
		System.out.println(jerry.getHat());
		System.out.println(jerry.getSegments());
		System.out.println(jerry.getButtons());
		System.out.println(jerry);
		System.out.println(gary);
		System.out.println(elim);
	}
}