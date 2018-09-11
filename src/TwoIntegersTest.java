import java.util.Scanner;
public class TwoIntegersTest 
{
	public static void main(String[] args)
	{ 
		Two Integers twointegers = new TwoIntegers(6,13);
		int num1 = twointegers.getNum1();
		int num2 = twointegers.getNum2();
		String arithmetic = twointegers.displayArithmetic();
		System.out.print(arithmetic);
	}
}
