package blinov.chapter6.a.task14;

public class LaserPrinter extends Printer {
	
	private String name;
	private int printResource;
	private int printSpeed;
	
	public LaserPrinter(String name, int printResource, int printSpeed) {
		this.name = name;
		this.printResource = printResource;
		this.printSpeed = printSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrintResource() {
		return printResource;
	}

	public void setPrintResource(int printResource) {
		this.printResource = printResource;
	}

	public int getPrintSpeed() {
		return printSpeed;
	}

	public void setPrintSpeed(int printSpeed) {
		this.printSpeed = printSpeed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + printResource;
		result = prime * result + printSpeed;
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
		LaserPrinter other = (LaserPrinter) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (printResource != other.printResource)
			return false;
		if (printSpeed != other.printSpeed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LaserPrinter [name=" + name + ", printResource=" + printResource + ", printSpeed=" + printSpeed + "]";
	}

	@Override
	public void print() {
		System.out.println("Печать со скоростью " + printSpeed + " листов в минуту.");
	}
	
	
}
