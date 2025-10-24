package media;

public class Demo {
    public static void main(String[] args) {
        // Source with Proxy
        IMediaSource remote = new CachingProxy(new LocalFileAdapter("movie.mp4"));

        // Media items
        MediaItem song = new MediaItem("Song", new LocalFileAdapter("song.mp3"));
        MediaItem video = new MediaItem("Video", remote);

        // Playlist (Composite)
        Playlist playlist = new Playlist("My Playlist");
        playlist.add(song);
        playlist.add(video);

        // Add Decorator (Watermark)
        PlaylistComponent decoratedPlaylist = new WatermarkDecorator(playlist);

        // Bridge: Choose renderer
        MediaPlayer player = new MediaPlayer(new SoftwareRenderer());
        player.play(decoratedPlaylist);

        // Switch to hardware renderer at runtime
        player.setRenderer(new HardwareRenderer());
        player.play(decoratedPlaylist);
    }
}
