import java.util.Scanner;
class product 
{
	public static void main(String[] args) 
	{ //scanner object creation
	  Scanner s=new Scanner(System.in);
	  //read the data from command promt
	  System.out.println("product name...");
	  String prodName=s.next();

	  System.out.println("product price...");
	  double prodPrice=s.nextDouble();

	  System.out.println("product quantity...");
	  int prodQuant=s.nextInt();

	  double total=prodPrice*prodQuant;
	  
	  if(total>1000)
		{
			double discount;
			discount=(20*total)/100;

			double totalPay;
			totalPay=total-discount;

			System.out.println("product name..."+prodName);
			System.out.println("product price..."+prodPrice);
			System.out.println("product quantity..."+prodQuant);
			System.out.println("total price..."+total);
			System.out.println("Discount amount..."+discount);
			System.out.println("net amount ton pay..."+totalPay);
		}
		else
		{
			double discount;
			discount=(10*total)/100;

			double totalPay;
			totalPay=total-discount;

			System.out.println("product name..."+prodName);
			System.out.println("product quantity..."+prodQuant);
			System.out.println("total price..."+total);
			System.out.println("Discount amount..."+discount);
			System.out.println("Net amount to pay..."+totalPay);
		}
		//close the scanner object
		s.close();
	 }
}
