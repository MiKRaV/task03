package blinov.chapter6.a.task06;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<AircraftCarrier> aircraftCarriers = new TreeSet<>();
		aircraftCarriers.add(new AircraftCarrier("Рональд Рейган", 90));
		aircraftCarriers.add(new AircraftCarrier("Теодор Рузвельт", 90));
		aircraftCarriers.add(new AircraftCarrier("Ляонин", 36));
		aircraftCarriers.add(new AircraftCarrier("Адмирал Кузнецов", 50));
		aircraftCarriers.add(new AircraftCarrier("Шарль де Голль", 40));
		
		for(AircraftCarrier x : aircraftCarriers) {
			System.out.println(x.toString());
		}

	}

}
