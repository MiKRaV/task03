package blinov.chapter6.a.task12;

import java.util.Comparator;

public class VideoPlayerVersionComparator implements Comparator<VideoPlayer>{

	@Override
	public int compare(VideoPlayer o1, VideoPlayer o2) {
		if(o1.getVersion() > o2.getVersion())
			return 1;
		else if(o1.getVersion() < o2.getVersion())
			return -1;
		else
			return 0;
	}

}
