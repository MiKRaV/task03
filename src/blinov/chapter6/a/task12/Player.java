package blinov.chapter6.a.task12;

public abstract class Player implements Mechanism {

	public void turnOn() {
		System.out.println("Плеер включен.");
	}
	
	public void turnOff() {
		System.out.println("Плеер выключен.");
	}
	
	public void play(String name) {
		System.out.println("Включено проигрывание: " + name);
	}
	
	public void pause(String name) {
		System.out.println("Приостановелно проигрывание: " + name);
	}
	
	public void stop(String name) {
		System.out.println("Остановелно проигрывание: " + name);
	}
}
