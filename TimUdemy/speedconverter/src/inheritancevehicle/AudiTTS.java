package inheritancevehicle;

public class AudiTTS extends Car
{
    private int roadservice;

    public AudiTTS(
        int roadservice)
    {
        super("AudiTTS",
            2,
            2,
            4,
            6,
            false);
        this.roadservice = roadservice;
    }
}
