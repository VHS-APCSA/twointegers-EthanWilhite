public class TwoIntegers 
{
	private int num1;
	private int num2;

	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}

	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public TwoIntegers addition(TwoIntegers twoint)
	{
		int value1 = this.value1 + twoint.getNum1();
		int value2 = this.value2 + twoint.getNum2();
		TwoIntegers result = new TwoIntegers(value1, value2);
		return result;
	}






}


