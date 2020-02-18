import java.util.Scanner;


public class CollegeSweathirts
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
	{
		int[][] arr = new int[4][7];
		String[] size = {"SMALL", "MEDIUM" , "LARGE", "X-LARGE"};
		int[] total = new int[7];
		int fintotal = 0;
		fill(size[0], arr, 0);
		fill(size[1], arr, 1);
		fill(size[2], arr, 2);
		fill(size[2], arr, 3);
		System.out.println("			Inventory Report\n");
		System.out.print("Size	");
		for(int i = 1; i < 8; i++)
		System.out.print(i + "	");
		System.out.println("Size Total");
		for(int i = 0; i < 74; i++)
		System.out.print("-");
		display(size[0], arr, 0);
		display(size[1], arr, 1);
		display(size[2], arr, 2);
		display(size[3], arr, 3);
		for(int i = 0; i < 74; i++)
		System.out.print("-");
		System.out.print("\nTotals	");
		for(int c = 0; c < arr[0].length; c++)
		{
			for(int r = 0; r < arr.length; r++)
			{
				total[c] += arr[r][c];
			}
			System.out.print(total[c] + "	");
		}
		for(int i = 0; i < total.length; i++)
		{
			fintotal += total[i];
		}
		System.out.println(fintotal);
	}
	public static void fill(String s, int[][] arr, int row)
	{
		int num = 0;
			for(int c = 0; c < arr[0].length; c++)
			{
				num = c + 1;
				System.out.print("Enter the number of " + s + " sweatshirts for college " + num + ":	");
				arr[row][c] = scan.nextInt();
				System.out.println();
			}
		System.out.println();
	}
	public static void display(String size, int[][] arr, int row)
	{
		int total = 0;
		System.out.print("\n" + size + "	");
		for(int c = 0; c < arr[0].length; c++)
		{
			System.out.print(arr[row][c] + "	");
			total += arr[row][c];
		}
		System.out.println(total);
	}
}