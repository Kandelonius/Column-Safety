package playingcat;

public class Main
{
	public static void main(String[] args)
	{
		isCatPlaying(1, 1, 1);
		isCatPlaying(1, 1, 2);
		isCatPlaying(1, 2, 3);
	}
	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		if(summer && (temperature >= 25) && (temperature <= 45))
		{
			return true;
		}else if((temperature >= 25) && (temperature <= 35))
		{
			return true;
		}
		return false;
	}
}