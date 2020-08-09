package simplecalculator;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        long firstNum;
        long secondNum;
        String operation;

        Scanner stdIn = new Scanner(System.in);
        firstNum = stdIn.nextLong();
        operation = stdIn.next();
        secondNum = stdIn.nextLong();
        switch (operation)
        {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                if (secondNum == 0)
                {
                    System.out.println("Division by 0!");
                    break;
                } else
                {
                    System.out.println(firstNum / secondNum);
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }
        stdIn.close();
    }
}