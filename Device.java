package hiWorld7;

public abstract class Device {
	private boolean isOn;
	private String name;
	
	public String getName() {
		return name;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setIsOn(boolean isOn) {
		this.isOn=isOn;
	}
	public Device(String name, boolean isOn) {
		this.name=name;
		this.isOn=isOn;
	}
	public Device() {
		this.name="unknown";
		this.isOn=false;
	}
	

}
