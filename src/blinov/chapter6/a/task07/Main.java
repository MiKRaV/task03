package blinov.chapter6.a.task07;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Neurosurgeon> doctors = new TreeSet<>();
		doctors.add(new Neurosurgeon(25));
		doctors.add(new Neurosurgeon(7));
		doctors.add(new Neurosurgeon(1));
		doctors.add(new Neurosurgeon(13));
		doctors.add(new Neurosurgeon(8));
		doctors.add(new Neurosurgeon(4));
		
		for (Neurosurgeon x : doctors) {
			System.out.println(x.toString());
		}
	}

	
}
