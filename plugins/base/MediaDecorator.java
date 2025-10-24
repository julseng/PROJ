package media;

public abstract class MediaDecorator extends PlaylistComponent {
    protected PlaylistComponent component;

    public MediaDecorator(PlaylistComponent component) {
        this.component = component;
    }

    public abstract void play();
}
