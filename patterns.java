class patterns
{
	public static void main(String [] args)
	{
		for (int row = 1;row<=5 ;row++ )
		{
			for (int col = 1;col<=row ;col++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int row1 =1;row1<=5 ;row1++ )
		{
			for (int col1 = 1;col1<=row1 ;col1++ )
			{
				System.out.print(row1+" ");
			}
			System.out.println();
		} 


		for (int row2 = 1;row2<=5 ;row2++ )
		{
			for (int col2=1;col2<=row2 ;col2++ )
			{
				System.out.print(col2+" ");
			}
			System.out.println();
		} 


		for (int row3 = 1;row3<=5 ;row3++ )
		{
			for (int col3=1;col3<=5 ;col3++ )
			{
				System.out.print("# ");
			}
			 System.out.println();
		}
	}


}