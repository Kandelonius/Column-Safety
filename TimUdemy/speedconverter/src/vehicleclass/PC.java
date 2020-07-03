package vehicleclass;

public class PC
{
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case theCase, Monitor monitor, Motherboard motherboard)
	{
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp()
	{
		theCase.pressPowerButton();
		// getTheCase().pressPowerButton();
		drawLogo();
	}

	private void drawLogo()
	{
		monitor.drawPixelAt(1200, 50, "yellow");
		// getMonitor.drawPixelAt(1200, 50, "yellow");
	}
	// private Case getTheCase() // commented out fore more private code.
	// {
	// 	return theCase;
	// }

	// private Monitor getMonitor()
	// {
	// 	return monitor;
	// }

	// private Motherboard getMotherboard()
	// {
	// 	return motherboard;
	// }
}