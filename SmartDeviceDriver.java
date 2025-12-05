package hiWorld7;
import java.util.Scanner;
import java.util.ArrayList;
public class SmartDeviceDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SmartDevice> devices = new ArrayList<>();
		devices.add(new SmartLight("Google Light", true, 50));
		devices.add(new SmartSpeaker("Bose Speaker", false, 50));
		devices.add(new SmartThermostat("Samsung Therm", true, 0));
		int choice;
		do {
		System.out.println("--MENU--");
		System.out.println("1. View status of all");
		System.out.println("2. Turn device ON");
		System.out.println("3. Turn device OFF");
		System.out.println("4. Adjust settings");
		System.out.println("5. Exit");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			for (SmartDevice d : devices) {
				d.getStatus();
				
			}
			break;
		case 2:
			System.out.println("Enter device number to turn on");
			for(int i = 0;i< devices.size();i++) {
				
			}
			int onIndex = sc.nextInt();
			devices.get(onIndex).turnOn();
			((Device)devices.get(onIndex)).setIsOn(true);
			break;
		case 3:
			System.out.println("Enter device number to turn off");
			for(int i=0;i<devices.size();i++) {
				
			}
			int offIndex = sc.nextInt();
			devices.get(offIndex).turnOff();
			((Device)devices.get(offIndex)).setIsOn(false);
			break;
		case 4:
			System.out.println("Choose device to adjust");
			for(int i=0;i<devices.size();i++) {
				
			}
			int idx=sc.nextInt();
			SmartDevice sd = devices.get(idx);
			if(sd instanceof SmartLight sl) {
				System.out.println("1. Increase brightness");
				System.out.println("2. Decrease brightness");
				int b = sc.nextInt();
				if (b==1)sl.increaseBrightness();
				else sl.decreaseBrightness();
			}
			else if (sd instanceof SmartSpeaker sp) {
				System.out.println("1. Increase volume");
				System.out.println("2. Decrease volume");
				int v = sc.nextInt();
				if(v==1)sp.increaseVolume();
				else sp.decreaseVolume();
			}
			else if(sd instanceof SmartThermostat st) {
				System.out.println("Enter room temp");
				int newTemp=sc.nextInt();
				st.setTemp(newTemp);
				st.setRoomTemp(newTemp);
			}
			break;		
		}	
		}	while (choice !=5);
		System.out.println("GoodBye");
		
		
		

	}

}
