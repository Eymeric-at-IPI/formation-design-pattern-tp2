package _1_decorator._2_windows._2_pattern;

import _1_decorator._2_windows.Window;

public class TopBorderDecoratorWindow extends DecoratorWindow {

    public TopBorderDecoratorWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("-----------");
        super.draw();
    }

    @Override
    public void setContent(String content) {
        super.setContent(content);
    }
}
