package polyMovie;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("movie time");
        for(int i=1; i<11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                " : " + movie.getName() + "\n" +
                "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new NMBC();
            case 2:
                return new DinnerWithAndre();
            case 3:
                return new Hannibal();
            case 4:
                return new OneHourPhoto();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
