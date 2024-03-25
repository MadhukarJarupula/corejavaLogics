import java.util.Scanner;
class product_2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter product name...");
		String name = s.next();

		System.out.println("enter product price...");
		double price = s.nextDouble();

		System.out.println("enter product quantity...");
		int quantity = s.nextInt();

		double totalPrice;
		totalPrice = price * quantity;

		double discount = 0.0;

		if (totalPrice >= 20000)
		  {
			discount = 20;
		  } 

		else if (totalPrice >=15000 && totalPrice < 20000)
		  {
			discount = 15;
		  }
		else if (totalPrice >= 10000 && totalPrice < 15000)
		 {
			discount = 10;
		 }
		else 
		{
			discount = 5;
		}

		double calcdiscount ;
		calcdiscount = (discount * totalPrice)/100;

		double netPay ;
		netPay = totalPrice - calcdiscount;

		System.out.println("product name = "+name);
		System.out.println("product price = "+price);
		System.out.println("quantity = "+quantity);
		System.out.println("discount = "+calcdiscount);
		System.out.println("net amounbt to pay = "+netPay);

		 s.close();
		}
}
