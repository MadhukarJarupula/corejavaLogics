class loop_2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
           System.out.print(i+"  ");
		}
          System.out.println();

   //print the even numbers from 1 to 10
     for (int i=1;i<=10;i++)
     {
		 if (i%2==0)
		 {
			 System.out.println("these are even numbers..."+i);
		 }
		     System.out.println();
	 }
  //print the odd numbers from 10 to 20
     for (int i=10;i<=20 ;i++ )
     {
		 if (i%2!=0)
		 {
			 System.out.println("these are odd numbers  "+i);
		 }
     }

  //print even and odd numbers from 5 to 25
    for (int i=5;i<=25;i++)
    {
		if (i%2==0)
		{
			System.out.println("even "+i);
		}
	else 
		{
			System.out.println("odd "+i);
		}
    }
     }      
}	
