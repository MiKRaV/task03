package blinov.chapter6.a.task14;

import java.util.Comparator;

public class LaserPrinterResourceComparator implements Comparator<LaserPrinter> {

	@Override
	public int compare(LaserPrinter o1, LaserPrinter o2) {
		if(o1.getPrintResource() > o2.getPrintResource())
			return 1;
		else if(o1.getPrintResource() < o2.getPrintResource())
			return -1;
		else 
			return 0;
	}

}
