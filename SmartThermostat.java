package hiWorld7;
import java.util.Scanner;

public class SmartThermostat extends Device implements SmartDevice {
	private int temp;
	Scanner sc= new Scanner(System.in);
	
	public void setTemp(int temp) {
		this.temp=temp;
	}
	public int getTemp() {
		return temp;
	}
	public SmartThermostat(String name, boolean isOn, int temp) {
		super(name, isOn);
		this.temp=temp;
	}
	public void setRoomTemp(int temp) {
		//temp=sc.nextInt();
		System.out.println("Room Temperature set to "+ temp+ " degrees");
	}
	
	
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart Thermostat is turning on");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart Thermostat is turning off");

	}

	@Override
	public void getStatus() {
		System.out.println("--Thermostat Status--");
		System.out.println("Power: "+(getIsOn()?"On":"Off"));
		System.out.println("Temperature: "+temp);
		// TODO Auto-generated method stub

	}

}
