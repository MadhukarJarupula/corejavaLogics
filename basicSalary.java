import java.util.Scanner;
class basicSalary 
{
	public static void main(String[] args) 
	{  
		Scanner s = new Scanner(System.in);

		System.out.println("Enter basic salary....");
		double basicSalary = s.nextDouble();

		double hra = 0.0;
		double da = 0.0;
		double pf = 0.0;
		
		if (basicSalary >= 50000)
		{
			hra = 30;
			da = 10;
			pf = 6;
		}
		else if (basicSalary < 50000 && basicSalary >=25000)
		{
			hra = 20;
			da = 5;
			pf = 3;
		}
		else 
		{
			hra = 10;
			da = 3;
			pf = 2;
		}
		double calculateHra;
		calculateHra = (hra*basicSalary)/100;

		double calcDa;
		calcDa = (da*basicSalary)/100;

		double calcPf;
		calcPf = (pf*basicSalary)/100;

		double grosSalary;
		grosSalary = basicSalary+calculateHra+calcDa+calcPf;

		System.out.println("your basic salary is "+basicSalary);
		System.out.println("your hra is ="+calculateHra);
		System.out.println("your da = "+calcDa);
		System.out.println("your pf = "+calcPf);
		System.out.println("your gross salary = "+grosSalary);

		s.close();
	}
}
