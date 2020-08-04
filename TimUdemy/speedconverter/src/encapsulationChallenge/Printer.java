package encapsulationChallenge;

public class Printer
{
    private int tonerLevel;

    private int numberOfPages;

    private boolean isDuplex;

    public Printer(
        int tonerLevel,
        //        int numberOfPages,
        boolean isDuplex)
    {
        if (tonerLevel > -1 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        } else
        {
            this.tonerLevel = -1;
        }
        //        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
        this.numberOfPages = 0;
    }

    public int getTonerLevel()
    {
        return tonerLevel;
    }

    public boolean isDuplex()
    {
        return isDuplex;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public int fillToner(int toner)
    {
        if ((this.tonerLevel + toner) <= 100)
        {
            System.out.println("Filling toner from " + tonerLevel + " to " + (tonerLevel += toner));
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else
        {
            System.out.println("It's not time to fill the toner.");
            System.out.println("you are still at " + this.tonerLevel);
            return -1;
        }
    }

    public int printPages(int pages)
    {
        if (this.isDuplex)
        {
            this.numberOfPages += (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
            return this.numberOfPages;
            //            if(pages % 2 == 1)
            //            {
            //                this.numberOfPages += 1;
            //            }
        } else
        {
            this.numberOfPages += pages;
            System.out.println("printed " + pages + " pages");
            return numberOfPages;
        }
        //        System.out.println("number of pages is "+this.numberOfPages);
    }
}
