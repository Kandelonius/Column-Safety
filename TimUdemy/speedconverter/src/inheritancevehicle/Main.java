package inheritancevehicle;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("beep beep");

        AudiTTS tts = new AudiTTS(36);
        tts.accelerate(30);
        tts.steer(45);
        tts.accelerate(20);
        tts.accelerate(-15);
    }
}
