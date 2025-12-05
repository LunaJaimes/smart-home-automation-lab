package hiWorld7;

public class SmartSpeaker extends Device implements SmartDevice {
	private int volume;
	
	public void setVolume(int volume) {
		this.volume= volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public SmartSpeaker(String name, boolean isOn, int volume) {
		super(name, isOn);
		this.volume=volume;
	}
	public void playSong(String song) {
		System.out.println("Smart Speaker is playing "+song);
	}
	public void decreaseVolume() {
		volume=volume-10;
	}
	public void increaseVolume() {
		volume=volume+10;
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart Speaker is turning on");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart Speaker is turning off");

	}

	@Override
	public void getStatus() {
		System.out.println("--Speaker Status--");
		
		System.out.println("Power: "+(getIsOn()?"On":"Off")+"\nVolume: "+volume);

	}

}
