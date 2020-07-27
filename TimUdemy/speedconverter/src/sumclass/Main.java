package sumclass;

public class Main
{
	public static void main(String[] args)
	{
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add = "+calculator.getAdditionResult());
		System.out.println("subtraction = "+calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply = "+calculator.getMultiplicationResult());
		System.out.println("divide = "+calculator.getDivisionResult());

		/*
		int num = 8;  // it's initialized by a value
		System.out.println(num % 2 == 0 ? "even" : "odd");

//		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
		int j = 0, k = 0, l = 0;
		for(int i = 0; i < 10; i++)
		{
			j = j + 1;
			k = k++;
			l++;
			System.out.println("j "+j+" k "+k+" l "+l);
		}
		System.out.println("j "+j+" k "+k+" l "+l);



		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a three digit number to be reversed");
		int tempNum = scanner.nextInt();
		int rebmun = 0;
		do
		{
			rebmun += tempNum%10;
			rebmun *= 10;
			tempNum /= 10;
		}while(tempNum > 0);
		rebmun /= 10;

		System.out.println(rebmun);
		int count = scanner.nextInt();
		for(int i = 0; i < count; i++)
		{
			System.out.println(i+"!");
		}
		*/
	}
}