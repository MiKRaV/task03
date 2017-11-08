package blinov.chapter6.a.task07;

public class Neurosurgeon extends Surgeon {

	private int experience;

	public Neurosurgeon(int experience) {
		super(experience);
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

	@Override
	public void easyOperation() {
		System.out.println("Проведена простая нейрохирургическая операция");
	}

	@Override
	public void mediumOperation() {
		System.out.println("Проведена нейрохирургическая операция средней сложности");
	}

	@Override
	public void hardOpertion() {
		System.out.println("Проведена сложная нейрохирургическая операция");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + experience;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Neurosurgeon other = (Neurosurgeon) obj;
		if (experience != other.experience)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Neurosurgeon [experience=" + experience + "]";
	}

	@Override
	public int compareTo(Surgeon o) {
		Neurosurgeon obj = (Neurosurgeon) o;
		return experience-obj.experience;
	}
	
	
	
	
}
