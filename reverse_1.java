import java.util.Scanner;
class reverse_1  
{
	public static void main(String[] args) 
	{  Scanner s = new Scanner(System.in);

		System.out.println("Enter a number...");
		int num = s.nextInt();

		int reverse=0;
		int	digit = 0;
		while (num!=0)
		{
           digit= num % 10;
		   reverse = reverse * 10+digit;
		   num/=10;
		}
		System.out.println(reverse);
		s.close();
	}
}
