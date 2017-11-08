package blinov.chapter6.a.task12;

public class VideoPlayer extends Player {
	
	private String name;
	private int version;
	
	public VideoPlayer(String name, int version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + version;
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
		VideoPlayer other = (VideoPlayer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VideoPlayer [name=" + name + ", version=" + version + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("Видеоплеер" + name + " включен.");
	}

	@Override
	public void turnOff() {
		System.out.println("Видеоплеер" + name + " выключен.");
	}

	@Override
	public void play(String name) {
		System.out.println("Включено проигрывание видео: " + name);
	}

	@Override
	public void pause(String name) {
		System.out.println("Приостановелно проигрывание видео: " + name);
	}

	@Override
	public void stop(String name) {
		System.out.println("Остановелно проигрывание видео: " + name);
	}
	
	

}
