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
		System.out.println(larger + " the largest number of these two numbers was returned ");
		boolean isEven = it.isEven();
		System.out.println(" is " + value1 + " + " + value2 + " even? = " + isEven);
		boolean isMultiple = it.isMultiple();
		System.out.println(" is " + value1 + " a multiple of " + value2 + " " + isMultiple );
		
		
		
		
	}
	
	





}
