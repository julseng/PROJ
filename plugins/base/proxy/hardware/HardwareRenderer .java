package media;

public class HardwareRenderer implements Renderer {
    @Override
    public void render(String data) {
        System.out.println("[Hardware Renderer] " + data);
    }
}
