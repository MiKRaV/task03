package blinov.chapter6.a.task06;

import java.util.ArrayList;

public class AircraftCarrier extends Warship implements Comparable<AircraftCarrier> {

	private String name;
	private ArrayList<String> guns;
	private int numOfAircraft;
	
	public AircraftCarrier(String name, int numOfAircraft) {
		super();
		this.name = name;
		this.numOfAircraft = numOfAircraft;
	}

	public AircraftCarrier(String name, ArrayList<String> guns, int numOfAircraft) {
		this.name = name;
		this.guns = guns;
		this.numOfAircraft = numOfAircraft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getGuns() {
		return guns;
	}

	public void setGuns(ArrayList<String> guns) {
		this.guns = guns;
	}

	public int getNumOfAircraft() {
		return numOfAircraft;
	}

	public void setNumOfAircraft(int numOfAircraft) {
		this.numOfAircraft = numOfAircraft;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guns == null) ? 0 : guns.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfAircraft;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AircraftCarrier other = (AircraftCarrier) obj;
		if (guns == null) {
			if (other.guns != null)
				return false;
		} else if (!guns.equals(other.guns))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfAircraft != other.numOfAircraft)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AircraftCarrier [name=" + name + ", guns=" + guns + ", numOfAircraft=" + numOfAircraft + "]";
	}

	@Override
	public int compareTo(AircraftCarrier o) {
		int compare = numOfAircraft-o.numOfAircraft;
		if(compare == 0) {
			compare = name.compareTo(o.name);
		}
		return compare;
	}
	
	

}
