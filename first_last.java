import java.util.Scanner;
class first_last 
{

	public static void main(String[] args) 
	{ Scanner s= new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = s.nextInt();

		int lastDigit = num % 10;
		int firstDigit=0;
        int sum =0;
		while (num!=0)
		{
			firstDigit = num % 10;
			num /=10;
		}
		 sum =lastDigit*firstDigit;
		 System.out.println(sum);
		 s.close();
	}
}
