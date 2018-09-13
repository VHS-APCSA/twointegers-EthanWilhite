import java.util.Scanner;
public class TwoIntegersTest 
{
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		TwoIntegers twointegers = new TwoIntegers(6,13);
		int num1 = twointegers.getNum1();
		int num2 = twointegers.getNum2();
		String arithmetic = twointegers.displayArithmetic();
		System.out.print(arithmetic);
		int larger = twointegers.larger();
		System.out.println(larger + " is larger than num1 so it was returned as true ");
		boolean isEven = twointegers.isEven();
		System.out.println(num2 + " is not even so = " + isEven);
		boolean isMultiple = twointegers.isMultiple();
		System.out.println(num2 + " is not a multiple of 6 so = "+ isMultiple );
		System.out.print(" Enter a number: ");
		int value = input.nextInt();
		
		
	}
	
	





}
