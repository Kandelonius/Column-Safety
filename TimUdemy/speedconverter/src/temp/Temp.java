package temp;

/*
Quick Review:
        This assignment exercises our ability to extend a simple Java class (properly) that
        maintains a time as three integers into another that includes a zone.  We don't want
        to shadow any superclass variables or duplicate any existing functionality that doesn't
        need to be overridden.
        We do, however, want to maintain all existing functionality and extended it where appropriate.
        Leverage existing methods as far as possible (to reduce code duplication) and make
        sure all constructors are available (hint:  constructors are never inherited).
        Lab Assignment:
        Provided is the source code for the TempPreview the document class which you
        will be extending (i.e., not modifying).  It stores the time as three integers and
        does not override the equals method it inherits from its superclass (i.e., class Object).
        Subclass Temp as GlobalTime by providing an integer zone field (named "zone")
        that allows for time zones values in the range of [-12, 12] (which doesn't comply with
        real-world conditions, but is ideal for this programming challenge).
        You might like to take a peek at the YouTube video "The Problem with Time & Timezones"
        which was mentioned in class.  It discusses how time is stored in computer systems so you
        can appreciate how complicated this task actually is.
        Of course, make sure that every feature of the superclass remains functional in the
        subclass, along with any new features of the subclass that you are required to add
        (either by general Java conventions or the challenge requirements included here).
        The toString of a GlobalTime should format as: H:MM:SS UTC[±][Z]
        That is: zero-pad the minute and second and leave no space between the literal "UTC"
        and the plus or minus sign and no space between the plus or minus sign and the zone.
        Note that if the zone is 0, then do not append either a plus or a minus sign nor the zone.
        A GlobalTime object should be considered equal to a Temp object if their hour,
        minute, and second match.  Do not make any changes to the Temp code.  Temp will
        not perform equals correctly but GlobalTime will.
        Comment the new features or your code well in JavaDoc format (don't bother commenting the
        existing features of Temp.  Include a description of how your equals implementation
        works, noting the differences when comparing Temp vs GlobalTime objects.
        Good luck,
        Dean.
*/
public class Temp {
    private int hour;                   // valid values 0 - 23
    private int minute;                 // valid values 0 - 59
    private int second;                 // valid values 0 - 59

    public Temp() {
        this(0, 0, 0);
    }

    public Temp(int h) {
        this(h, 0, 0);
    }

    public Temp(int h, int m) {
        this(h, m, 0);
    }

    public Temp(int h, int m, int s) {
        setTemp(h, m, s);
    }

    public Temp(Temp otherTime) {
        this(otherTime.hour, otherTime.minute, otherTime.second);
    }

    public void setTemp(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public void setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
    }

    public void setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format
                (
                        "%d:%02d:%02d %s",
                        (hour == 0 || hour == 12) ? 12 : hour % 12, minute, second,
                        hour < 12 ? "AM" : "PM"
                );
    }

    public static void main(String[] args)   // Temp Self-Test
    {
        Temp t1 = new Temp(20, 30, 40);
        Temp t2 = new Temp(20, 30, 40);
        Temp t3 = new Temp(20, 30, 50);

        System.out.println("Time 1 is: " + t1);
        System.out.println("Time 2 is: " + t2);
        System.out.println("Time 3 is: " + t3);
        System.out.println("Time 1 and 2 match: " + t1.equals(t2));
        System.out.println("Time 2 and 3 match: " + t2.equals(t3));
    }
}

