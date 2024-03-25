import java.util.Scanner;

class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number limit");
		int number = s.nextInt();
		int sum=0;

		for (int i=1;i<=number ;i++ )
		{
			int n=i;
			int n1=i;
			//int fact = 1;
			sum = 0;

			while (n!=0)
			{
				int digit = n%10;
				
                int fact = 1;
				int j = 1;

				while (j<=n)
				{
                    j=1;
					fact = fact * j;
					j++;
				}
				sum = sum + fact;
				n = n / 10;
				
					
			}

					if (sum == n1)
					{

						System.out.println("it is an armstrong number"+i);
	      	}
		}


			              
	}
		
		
}
