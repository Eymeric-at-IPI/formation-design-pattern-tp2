package _1_decorator._2_windows._2_pattern;

import _1_decorator._2_windows.SimpleTextWindow;
import _1_decorator._2_windows.Window;

public class Main {
    public static void main(String[] args) {
        Window window = new SimpleTextWindow("Hello world!");
        window.draw();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        window = new TopBorderDecoratorWindow(window);
        window.draw();
    }
}
