package blinov.chapter6.a.task14;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Comparator<LaserPrinter> comp = new LaserPrinterSpeedComparator().thenComparing(new LaserPrinterResourceComparator());
		TreeSet<LaserPrinter> printers = new TreeSet<>(comp);
		printers.add(new LaserPrinter("HP", 3000, 50));
		printers.add(new LaserPrinter("Canon", 2500, 50));
		printers.add(new LaserPrinter("Epson", 4000, 40));
		
		for (LaserPrinter x : printers) {
			System.out.println(x.toString());
		}
	}

}
