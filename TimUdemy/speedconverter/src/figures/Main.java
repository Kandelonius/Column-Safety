package figures;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		slashFigure(6);
		slashFigure2(6);
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
}