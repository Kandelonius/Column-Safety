package figures;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		slashFigure(6);
		slashFigure2(6);
		printSquareStar(5);
		printSquareStar(8);
	}
	public static void slashFigure(int dimension)
	{
	// public static final int dimension = 6;
			
		for (int  rows = 1; rows <= dimension; rows++){
			for (int i = 1; i < rows; i++){
				System.out.print("\\\\");
			}
			for (int j = 1; j <= dimension - rows; j++){
				System.out.print("!!");
			}
			System.out.print("!!");
			for (int j = 1; j <= dimension - rows; j++){
				System.out.print("!!");
			}
			
			for (int i = 1; i < rows; i++){
				System.out.print("//");
			}
			System.out.println();
		}
		
	}
	public static void slashFigure2(int dimension) 
	{
	
// public static final int dimension = 6;
		
		writeChars('!' , 2*dimension);
		System.out.print("!!");
		writeChars('!' , 2*dimension);
		System.out.println();
		for (int  rows = 1; rows <= dimension; rows++){
			writeChars('\\' , 2*rows);
			writeChars('!' , 2*dimension - 2*rows);
			System.out.print("!!");
			writeChars('!' , 2*dimension - 2*rows);
			writeChars('/' , 2*rows);
			System.out.println();
		}
	}
	public static void writeChars(char ch, int number)
	{
		for (int i = 1; i <= number; i++)
			System.out.print(ch);
	}

	public static void printSquareStar(int number)
	{
		/*
		 *four conditions:
 		 *in the first or last row
 		 *in the first or last column
 		 *when the row number equals the column number
 		 *when the column number equals rowCount - currentRow + 1 (where currentRow is curent row number)
		*/
		if(number < 5)
		{
			System.out.println("Invalid Value");
			return;
		}
		for(int i = 1; i <= number; i++)
		{
			for(int j = 1; j <= number; j++)
			{
				if(i == 1 )
				{
					System.out.print("*");
				}else if(i == (number)){
					System.out.print("*");
				}else if(j == 1)
				{
					System.out.print("*");
				}else if(j == (number))
				{
					System.out.print("*");
				}else if(i == j)
				{
					System.out.print("*");
				}else if(i == (number - j + 1))
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}