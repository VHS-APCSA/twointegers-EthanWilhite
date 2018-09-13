import java.util.Scanner;
public class TwoIntegersTest 
{
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter two numbers: ");
		int value1 = input.nextInt();
		int value2 = input.nextInt(); 
		TwoIntegers it = new TwoIntegers(value1, value2);
		int sum1 = it.getNum1();
		int sum2 = it.getNum2();
		int num1 = it.getNum1();
		int num2 = it.getNum2();
		String arithmetic = it.displayArithmetic();
		System.out.print(arithmetic);
		int larger = it.larger();
		System.out.println(larger + " is larger than num1 so it was returned as true ");
		boolean isEven = it.isEven();
		System.out.println(num2 + " is not even so = " + isEven);
		boolean isMultiple = it.isMultiple();
		System.out.println(num2 + " is not a multiple of 6 so = "+ isMultiple );
		
		
		
		
	}
	
	





}
