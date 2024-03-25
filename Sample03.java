class  Sample
{
	public static void main(String[] args) 
	{
		int n1=34;
		int n2=21;
		int sum=0;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<=9;i++)
		{
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;

		}
	}
}
