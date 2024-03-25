import java.util.Scanner;
class weatherReport 
{
	public static void main(String[] args) 
	{  //Scanner object creation
		Scanner s= new Scanner(System.in);

		System.out.println("Is raining true/false");
		boolean isRaining=s.nextBoolean();

		System.out.println("Is wind true/false");
		boolean isWind=s.nextBoolean();

		if(isRaining&&isWind)
		{
			System.out.println("Dont go heavy cyclone outside...");
		}

		else if (isRaining||isWind)
		{ 
           System.out.println("as your choice weather not much good now..");
		}

		else
		{
			System.out.println("Weather is cool outside, Go and enjoy the trip...");
		}
         s.close();

	}
}
