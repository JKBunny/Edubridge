import java.util.Scanner;
class     PerformOperations1
{
	private static int subtract(int num1, int num2)//formal parameter
	{
	  int sub=num1-num2;
	  return sub;
	}
	private static int multiply(int num1, int num2)
	{
	  int multi=num1*num2;
	  return multi;
	}
	private static int division(int num1, int num2)
	{
	  int div=num1/num2;
	  return div;
	}
	public static void main(String[] args) 
	{
		//local variables 
	//Scanner is predefined class 
Scanner scanner =new Scanner(System.in);
System.out.println("Enter the number 1 and number2");
		//nextInt is predefined method reads the integer value from user
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
	//calling subtract method
		int result1=subtract(num1, num2);//actual parameter 
		System.out.println("Subtraction : "+result1);

//calling multiply method		
int result3= multiply(num1,num2);
		System.out.println("multiplication : "+result3);

		int result4= division(num1,num2);
		System.out.println("division : "+result4);
	}
}