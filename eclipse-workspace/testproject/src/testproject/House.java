package testproject;

public class House {
	boolean lightsTurnedOnStatus=false;
	private boolean alarm = true;
	private String ownerName;
	private String houseAdd="12 london st";
	public House(){
		System.out.println("house construtor");
	}
	public House(String address) {
		houseAdd=address;
		System.out.println("house address "+ houseAdd);
	}
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public static void main(String[] args) {
		
		
		House house1 = new House();
		//house1.flipLightSwitch();
		//house1.flipLightSwitch();
		//house1.flipLightSwitch();
		house1.openFrontDoor();
		house1.alarmSetting();
		
	}
	
	public void flipLightSwitch() {
		lightsTurnedOnStatus =! lightsTurnedOnStatus;
		System.out.println("lights are "+ lightsTurnedOnStatus);
	}
	private void alarmSetting() {
		alarm =! alarm;
		System.out.println("Alarm is " + alarm);
	}
	public void openFrontDoor(){
		System.out.println("Front door has been opened");
	}
}

	/* public void flipLightSwitch() {
	 if(lightsTurnedOnStatus==false) {
		 lightsTurnedOnStatus=true;
	 }
		 else {
			 lightsTurnedOnStatus=false;
			 	 }
		 System.out.println("lights are "+ lightsTurnedOnStatus);
	 */
	 
	 


