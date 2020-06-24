package leapyear;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(isLeapYear(-1));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(8244));
		System.out.println(getDaysInMonth(2, 2016));
		System.out.println(getDaysInMonth(2, 1482));
		System.out.println(getDaysInMonth(2, 6830));
		System.out.println(getDaysInMonth(2, 8244));
	}
	public static boolean isLeapYear(int year)
	{
		if(year < 1 || year > 9999)
		{
			return false;
		}
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	public static int getDaysInMonth(int month, int year)
    {
    	if(year < 1 || year > 9999 || month > 12 || month < 1)
    	{
    		return -1;
    	}
        switch (month) {
            case 1:
                return 31;
                // break; no break required with return.h
            case 2:
                
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return -1;
    }
}