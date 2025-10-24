package media;

public class LocalFileAdapter implements IMediaSource {
    private String fileName;

    public LocalFileAdapter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        System.out.println("Opening local file: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing local file: " + fileName);
    }
}
