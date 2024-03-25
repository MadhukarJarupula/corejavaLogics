class Sample01 
{
	public static void main(String[] args) 
	{
		int cond=9,a,n1=34,n2=21,n3;
		System.out.print(n1+" "+n2);
		for(a=13;a<=cond;a++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
