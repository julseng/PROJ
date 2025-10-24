package media;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends PlaylistComponent {
    private String name;
    private List<PlaylistComponent> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    @Override
    public void add(PlaylistComponent c) {
        components.add(c);
    }

    @Override
    public void play() {
        System.out.println("Playlist: " + name);
        for (PlaylistComponent c : components) {
            c.play();
        }
    }
}
