package vehicleclass;

public class Motherboard
{
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int carsSlots;
	private String bios;

	public Motherboard(String model, String manufacturer, int ramSlots, int carsSlots, String bios)
	{
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.carsSlots = carsSlots;
		this .bios = bios;
	}

	public void loadProgram(String programName)
	{
		System.out.println("Program "+programName+" is now loading!");
	}

	public String getModel()
	{
		return model;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public int getRamSlots()
	{
		return ramSlots;
	}

	public int getCarsSlots()
	{
		return cardSlots;
	}

	public String getBios()
	{
		return bios;
	}
}