import java.util.Scanner;
class loop_8 
{
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
     System.out.println("Eneter your selling amt");
	 int selling = s.nextInt();

	 System.out.println("Eneter your parchase amt");
	 int parchase = s.nextInt();

	  int result = selling - parchase;
	  
	  if (result>0)
	  {
		  System.out.println("you got proffit of "+result);
	  }
	 else if (result<0)
	 {
		 System.out.println("you got loss of "+result);
	 }
	 else 
		{
			System.out.println("no loss no proffit");
		}	
	 }
}
