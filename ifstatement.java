class venkat 
{
	public static void main(String[] args)
	{
	// 0 1 1 2 3 5 8 13 21 34 55 89 
	//   | | | | | | | |   |  |  | |
	 //0 1 2 3 4 5 6 7  8  9  10 11

	int count=11;
	int a=0;
	int b=1;
	int sum=0;
	
	System.out.print(a+" "+b+" ");

	for(int i=2;i<=count;i++)
		{
		
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;

		}

		System.out.println("****************");
		
		for(int j=count-1;j>0;j--)
		{
		   sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;	
		}
	}
}
