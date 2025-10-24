package media;

public class MediaPlayer {
    private Renderer renderer;

    public MediaPlayer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void play(PlaylistComponent component) {
        renderer.render("Starting playback...");
        component.play();
        renderer.render("Playback finished.");
    }
}
