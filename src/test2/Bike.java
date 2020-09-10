package test2;

public class Bike implements BasicBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = new Bike();
		bike.applyBrake();
		bike.increaseSpeed();
		System.out.println(bike.noOfWheels);
		
		

	}

	@Override
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("applyBrake");
		
		
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		System.out.println("increaseSpeed");
		
	}
	
	

}
