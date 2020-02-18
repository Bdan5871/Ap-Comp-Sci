import java.util.*;
public class FindFactors
{
	public static void main(String[] args)
	{
		//object variable
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: " );
		int num = scan.nextInt();
		System.out.println("Factors of " + num + ":" + getFactors(num));
	}
	public static ArrayList<Integer> getFactors(int num)
	{
		//object variable
		ArrayList<Integer> factor = new ArrayList<Integer>();
		//finds if it is a factor
		for(int i = 2; i < num; i++)
		{
			if(num%i == 0)
			{
				factor.add(i);
			}
		}
		return factor;
	}
}