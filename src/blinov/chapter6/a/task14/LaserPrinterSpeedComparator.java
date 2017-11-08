package blinov.chapter6.a.task14;

import java.util.Comparator;

public class LaserPrinterSpeedComparator implements Comparator<LaserPrinter> {

	@Override
	public int compare(LaserPrinter o1, LaserPrinter o2) {
		if(o1.getPrintSpeed() > o2.getPrintSpeed())
			return 1;
		else if(o1.getPrintSpeed() < o2.getPrintSpeed())
			return -1;
		else
			return 0;
	}

}
