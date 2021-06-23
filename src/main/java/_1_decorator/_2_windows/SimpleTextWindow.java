package _1_decorator._2_windows;

public class SimpleTextWindow implements Window {

    private String content;

    public SimpleTextWindow() {
        this("content");
    }

    public SimpleTextWindow(String content) {
        this.content = content;
    }

    public void draw() {
        System.out.print(content);
    }

    public void setContent(String content) {
        this.content = content;
    }

}
