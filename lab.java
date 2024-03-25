class lab 
{
	public static void main(String[] args) 
	{  int n=30,sum=0;

		for (int i=1;i<=n;i++ )
		{
			for (int j=1;j<=n/2;j++ )
			{
				if (i%j==0)
				{
					sum=sum+j;
					
				}
			if (sum==i)
			{
				System.out.print(i);
			}
		   }
		}
	}
}
