import java.util.*;
public class Names
{
	public static void main(String[] args)
	{
		//object variables
		ArrayList<String> names = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name: ");
		names.add(scan.next());
		//fill array list
		while(!names.get(names.size() - 1).equalsIgnoreCase("stop"))
		{
			System.out.print("Enter a name: ");
			names.add(scan.next());
		}
		names.remove(names.size()-1);
		System.out.println("The ArrayList contains " + names.size() + " entries.");
		System.out.println(names);
	}
}