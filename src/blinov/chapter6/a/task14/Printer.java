package blinov.chapter6.a.task14;

public class Printer implements PrintingDevice {

	private String name;
	private int printResource;
	
	public Printer() {
		super();
	}

	public Printer(String name, int printResource) {
		super();
		this.name = name;
		this.printResource = printResource;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + printResource;
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
		Printer other = (Printer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (printResource != other.printResource)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Printer [name=" + name + ", printResource=" + printResource + "]";
	}

	@Override
	public void print() {
		System.out.println("Обычная печать");
	}

}
