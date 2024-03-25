import java.util.Scanner;
class one 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number to convert in to words");
		int number =s.nextInt();

		int reverse=0;
        

		while (number!=0)
		{
			int digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
		}

		 String num = null;

		while (reverse!=0)
		{
			int digit=reverse%10;

			
			switch (digit)
			{
			case 1 :num= "one";
			           break;    

			case 2 :num= "two";
			           break;   
			
			case 3 :num= "three";
			           break; 

			case 4 :num= "four";
			           break;

			case 5 :num= "five";
			           break;

			case 6 :num= "six";
			           break;

			case 7 :num= "seven";
			           break;

			case 8 :num= "eight";
			           break;

			case 9 :num="nine";
			           break;

		    case 0 :num="zero";
                        break;
	} 
			reverse= reverse/10;
           System.out.print(num+" ");              
		}
	}
}
