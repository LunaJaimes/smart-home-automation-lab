package hiWorld7;

public class SmartLight extends Device implements SmartDevice {
	private int brightness;
	
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness=brightness;
	}
	public SmartLight(String name, boolean isOn, int brightness) {
		super(name, isOn);
		this.brightness=brightness;
	}
	public void decreaseBrightness() {
		System.out.println("Brightness decreased -10");
		this.brightness=brightness-10;
	}
	public void increaseBrightness() {
		System.out.println("Brightness increased +10");
		this.brightness=brightness+10;
	}
	
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart Light is turning on");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart Light is turning off");

	}

	@Override
	public void getStatus() {
		System.out.println("--Light Status--");
		System.out.println("Power: "+(getIsOn() ? "on":"off"));
		System.out.println("Brightness: "+ brightness);
		// TODO Auto-generated method stub
		
	}

}
