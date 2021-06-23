package _1_decorator._2_windows._2_pattern;

import _1_decorator._2_windows.Window;

public class DecoratorWindow implements Window {
    private Window window;

    public DecoratorWindow(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }

    @Override
    public void setContent(String content) {
        window.setContent(content);
    }
}
