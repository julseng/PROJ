package media;

public class HLSAdapter implements IMediaSource {
    private String hlsUrl;

    public HLSAdapter(String hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    @Override
    public void open() {
        System.out.println("Opening HLS Stream: " + hlsUrl);
    }

    @Override
    public void play() {
        System.out.println("Playing HLS Stream from: " + hlsUrl);
    }

    @Override
    public void close() {
        System.out.println("Closing HLS Stream: " + hlsUrl);
    }
}

