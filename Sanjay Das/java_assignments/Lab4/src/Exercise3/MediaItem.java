package Exercise3;

abstract class MediaItem {
	private int runTime;

	class Video extends MediaItem {
		private String director;
		private String genre;
		private int year;
	}

	class CD extends MediaItem {
		private String artist;
		private String genre;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
}