import java.util.Scanner;
class reverse_2 
{
	public static void main(String[] args) 
	{ Scanner s = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = s.nextInt();

		int sum=0,digit=0;

		while (num!=0)
		{
			digit = num % 10;
			sum = sum + digit;
			num /=10;

		}
		System.out.println("sum of all digits ="+sum);
		s.close();
	}
}
