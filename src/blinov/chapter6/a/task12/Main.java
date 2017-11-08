package blinov.chapter6.a.task12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Comparator<VideoPlayer> comp = new VideoPlayerNameComparator().thenComparing(new VideoPlayerVersionComparator());
		TreeSet<VideoPlayer> videoPlayers = new TreeSet<>(comp);
		videoPlayers.add(new VideoPlayer("KMPlayer", 5));
		videoPlayers.add(new VideoPlayer("VLC Media Player", 2));
		videoPlayers.add(new VideoPlayer("VLC Media Player", 4));
		videoPlayers.add(new VideoPlayer("Media Player Classic", 1));
		videoPlayers.add(new VideoPlayer("VLC Media Player", 3));
		videoPlayers.add(new VideoPlayer("Media Player Classic", 2));
		videoPlayers.add(new VideoPlayer("KMPlayer", 3));
		
		for (VideoPlayer x : videoPlayers) {
			System.out.println("Видео плеер " + x.getName() + " версии " + x.getVersion());
		}
	}

}
