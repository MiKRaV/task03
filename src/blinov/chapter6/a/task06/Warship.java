package blinov.chapter6.a.task06;

public abstract class Warship implements Ship{

	public void swim(int speed) {
		System.out.println("Плыть со скоростью " + speed + " узлов.");
	}
	
	public void fire(String gun) {
		System.out.println("Открыта стрельба из орудия: " + gun);
	}
	
	public void stopFire(String gun) {
		System.out.println("Cтрельба из орудия " + gun + " прекращена.");
	}
}
