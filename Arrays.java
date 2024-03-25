class Check 
{	public static void main(String[] args) 
	{
		int [] prices = {500,200,300,600};

		//Printing the data using sop statement
		System.out.println("The first index is.... "+prices[0]);
		System.out.println("The first index is.... "+prices[1]);
		System.out.println("The first index is.... "+prices[2]);
		System.out.println("The first index is.... "+prices[3]);

		//Printing the dara using forLoop 
		for (int i=0;i<=prices.length-1;i++ )
		{
			System.out.println(prices[i]);
		}

		//Printing the data using forEach loop 
		for(int price :prices){
			System.out.println("Printing the data using ForEach loop "+price);
		}

	}
}
class ArrayInsalizaion
{
	public static void main(String [] args){
		int [] i;
		boolean [] j = new boolean[5];
		int[] a =new int[3];
		for (int k=0;k<j.length ;k++ )
		{
			System.out.println(j[k]);
		}
	}
}

class Re_assigning
{
	public static void main(String [] args){
		int arr[]= new int[5];
		arr[0]=10;
		System.out.println("first insilization  "+arr[0]);

		arr[0]=20;
		System.out.println("first insilization  "+arr[0]); 
	}

}
