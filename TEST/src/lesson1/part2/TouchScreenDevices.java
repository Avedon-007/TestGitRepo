package lesson1.part2;

public class TouchScreenDevices 
{
	private double sizeDevice;
	private String bodyColor;
	protected String typeOfScreen;
	private double screenSize;
	private String screenResolution;
	private String bodyMaterials;
	private int mechanicalButtonsQuantity;
	private int camerasQuantity;
	
	public TouchScreenDevices(){}
	
	public TouchScreenDevices(String bodyColor, String typeOfScreen, double screenSize, String screenResolution, 
								int mechanicalButtonsQuantity, int camerasQuantity)
	{
		this.bodyColor = bodyColor;
		this.typeOfScreen =typeOfScreen;
		this.screenSize = screenSize;
		this.screenResolution = screenResolution;
		this.mechanicalButtonsQuantity = mechanicalButtonsQuantity;
		this.camerasQuantity = camerasQuantity;
	}

	public double getSizeDevice() {
		return sizeDevice;
	}

	public void setSizeDevice(double sizeDevice) {
		this.sizeDevice = sizeDevice;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public String getTypeOfScreen() {
		return typeOfScreen;
	}

	public void setTypeOfScreen(String typeOfScreen) {
		this.typeOfScreen = typeOfScreen;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getBodyMaterials() {
		return bodyMaterials;
	}

	public void setBodyMaterials(String bodyMaterials) {
		this.bodyMaterials = bodyMaterials;
	}

	public int getMechanicalButtonsQuantity() {
		return mechanicalButtonsQuantity;
	}

	public void setMechanicalButtonsQuantity(int mechanicalButtonsQuantity) {
		this.mechanicalButtonsQuantity = mechanicalButtonsQuantity;
	}

	public int getCamerasQuantity() {
		return camerasQuantity;
	}

	public void setCamerasQuantity(int camerasQuantity) {
		this.camerasQuantity = camerasQuantity;
	}
		
	public static void main(String[] args)
	{
		TouchScreenDevices cellphoneLGE988 = new TouchScreenDevices("Black", "IPS", 5.55, "1920x1080", 4, 2);
		System.out.println("Body color of cell phone LG E988 is: " + cellphoneLGE988.getBodyColor());
		System.out.println("Screen type of cell phone LG E988 is: " + cellphoneLGE988.getTypeOfScreen());
		System.out.println("Screen size of cell phone LG E988 is: " + cellphoneLGE988.getScreenSize() + "in");
		System.out.println("Screen resolution of cell phone LG E988 is: " + cellphoneLGE988.getScreenResolution());
		System.out.println("Buttons quantity of cell phone LG E988 is: " + cellphoneLGE988.getMechanicalButtonsQuantity());
		System.out.println("Cameras quantity of cell phone LG E988 is: " + cellphoneLGE988.getCamerasQuantity());
	}		
}

/*
public void ring() {}
public void dialNumber() {}
public void sendMessage() {}

*/