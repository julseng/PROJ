package media;

public class SoftwareRenderer implements Renderer {
    @Override
    public void render(String data) {
        System.out.println("[Software Renderer] " + data);
    }
}
