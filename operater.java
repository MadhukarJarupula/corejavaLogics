import java.util.Scanner;
class operator
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter first number...");
		int num1 = s.nextInt();

		System.out.println("enter second number...");
		int num2 = s.nextInt();

		System.out.println("enter operater +,-,*,/,%..");
		char operat = s.next().charAt(0);

		int result = 0;
		switch (operat)
		{
		case '+': result = num1 + num2;
		           break;
		case '-': result = num1 - num2;
		           break;
		case '*': result = num1 * num2;
		           break;
	    case '/': result = num1 / num2;
		           break;

		case '%': result = num1 % num2;
		           break;
		}
         System.out.println("you selected.."+operat+"  "+result);
		 s.close();
	}
}