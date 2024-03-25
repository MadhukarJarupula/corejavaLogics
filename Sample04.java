import java.util.Scanner;
class Sample04 
{
	public static void main(String[] args) 
	{   Scanner s = new Scanner(System.in);

	    System.out.println("enter a number for febonacci series");
		int n =s.nextInt();

		int[] feb = new int[n];
		feb[0]=0;
		feb[1]=1;
		 // forword febinocci
         System.out.print(feb[0]+" "+feb[1]+" ");
		for (int i=2;i<n;i++)
		{
			feb[i]=feb[i-2]+feb[i-1];
			System.out.print(feb[i]+" ");
		}
		System.out.println();

		for (int j=n-1;j>0 ;j--)
		{
			System.out.print(feb[j]+" "); //reverse febinocci
		}
		System.out.print(feb[0]);
		
	}
}
