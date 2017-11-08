package blinov.chapter6.a.task12;

public abstract class Player implements Mechanism {

	public void turnOn() {
		System.out.println("����� �������.");
	}
	
	public void turnOff() {
		System.out.println("����� ��������.");
	}
	
	public void play(String name) {
		System.out.println("�������� ������������: " + name);
	}
	
	public void pause(String name) {
		System.out.println("�������������� ������������: " + name);
	}
	
	public void stop(String name) {
		System.out.println("����������� ������������: " + name);
	}
}
