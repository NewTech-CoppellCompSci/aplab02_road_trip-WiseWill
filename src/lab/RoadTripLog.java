package lab;

public class RoadTripLog {
//making my vars
	private double distance;
	private double fuel;
	private String tripName;
	//makjing my constructor
	public RoadTripLog (String name){
		this.distance = distance;
		this.fuel = fuel;
		this.tripName = name;
		
		
		
	}
	
	
	//making my setters to be able to change distance and fuel
	public void addDistance(double added) {
		distance += added;
	}
	public void addFuel(double added) {
		fuel += added;
	}
	//adding my getters to return vars to runner
	public double getTotalDistance() {
		
		return distance;
	}
	public double getTotalFuel() {
		
		return fuel;
	}
	public double getMPG(){
		
		return  distance/fuel;
	}
	//making a tostring method
	public String toString() {
		return tripName + "\n    Distance:  " + distance + "\n    Fuel Used: " + fuel+ "\n    MPG:       "  + getMPG();
		
	}
	
	
}
