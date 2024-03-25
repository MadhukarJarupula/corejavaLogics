import java.util.Scanner;
class trafficLight 
{  
	    

	    String redSignal();
		{
			System.out.println("you selected red signal...");
			System.out.println("Dont go danger...");
			
		}
		String yellowSignal();
		{
			System.out.println("you selected yellow signal...");
			System.out.println("be alert ready to go...");
			
		}
		String greenSignal();
		{
			System.out.println("you selected green signal...");
			System.out.println("Now you can go...");

		}
	    public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter traffic light 1,red 2,yellow 3,green");
		String light = s.nextLine();

		trafficLight tf = new trafficLight();
		tf.redSignal();
		tf.yellowSignal();
		tf.greenSignal();
	}
  }

 
