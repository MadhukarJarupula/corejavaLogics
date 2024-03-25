import java.util.Scanner;
class distance 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of coount you want");
		int number = s.nextInt();

		System.out.println("Enter starting number where you want");
		int start = s.nextInt();

		System.out.println("Enter distance of each number");
		int distance = s.nextInt();

		for (int i=1;i<=number;i++)
		{
			System.out.print(start+" ");
			start = start+distance;
		}

	}
}
