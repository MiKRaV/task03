package blinov.chapter6.a.task07;

public class Surgeon implements Doctor, Comparable<Surgeon> {

	private int experience;
	
	public Surgeon(int experience) {
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public void treat() {
		if(experience < 5) {
			easyOperation();
		} else if(experience >= 5 && experience < 10) {
			mediumOperation();
		} else {
			hardOpertion();
		}		
	}
	
	public void easyOperation() {
		System.out.println("Проведена простая операция");
	}
	
	public void mediumOperation() {
		System.out.println("Проведена операция средней сложности");
	}
	
	public void hardOpertion() {
		System.out.println("Проведена сложная операция");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + experience;
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
		Surgeon other = (Surgeon) obj;
		if (experience != other.experience)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Surgeon [experience=" + experience + "]";
	}

	@Override
	public int compareTo(Surgeon o) {		
		return experience-o.experience;
	}
}
