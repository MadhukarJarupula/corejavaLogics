class pattern
{
	public static void main(String[] args)
	{ char ch=65;
		for (int row=1;row<=5;row++ )
		{
		for (int i=5;i>=5-row;i--)
		{
		 	System.out.print(" ");
		}
		for (int col=5;col>=row ;col-- )
		{
			System.out.print((char)(ch++));
		}
          System.out.println(); 
       }
	}
}