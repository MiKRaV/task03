package blinov.chapter6.a.task06;

public abstract class Warship implements Ship{

	public void swim(int speed) {
		System.out.println("����� �� ��������� " + speed + " �����.");
	}
	
	public void fire(String gun) {
		System.out.println("������� �������� �� ������: " + gun);
	}
	
	public void stopFire(String gun) {
		System.out.println("C������� �� ������ " + gun + " ����������.");
	}
}
