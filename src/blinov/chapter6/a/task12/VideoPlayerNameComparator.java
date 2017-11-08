package blinov.chapter6.a.task12;

import java.util.Comparator;

public class VideoPlayerNameComparator implements Comparator<VideoPlayer> {

	@Override
	public int compare(VideoPlayer o1, VideoPlayer o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
