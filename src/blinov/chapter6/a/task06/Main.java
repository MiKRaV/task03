package blinov.chapter6.a.task06;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<AircraftCarrier> aircraftCarriers = new TreeSet<>();
		aircraftCarriers.add(new AircraftCarrier("������� ������", 90));
		aircraftCarriers.add(new AircraftCarrier("������ ��������", 90));
		aircraftCarriers.add(new AircraftCarrier("������", 36));
		aircraftCarriers.add(new AircraftCarrier("������� ��������", 50));
		aircraftCarriers.add(new AircraftCarrier("����� �� �����", 40));
		
		for(AircraftCarrier x : aircraftCarriers) {
			System.out.println(x.toString());
		}

	}

}
