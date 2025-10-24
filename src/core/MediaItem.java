package media;

public class MediaItem extends PlaylistComponent {
    private String title;
    private IMediaSource source;

    public MediaItem(String title, IMediaSource source) {
        this.title = title;
        this.source = source;
    }

    @Override
    public void play() {
        source.open();
        source.play();
        source.close();
    }
}

