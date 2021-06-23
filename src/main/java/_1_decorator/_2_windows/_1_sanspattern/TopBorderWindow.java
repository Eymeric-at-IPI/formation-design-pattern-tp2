package _1_decorator._2_windows._1_sanspattern;

import _1_decorator._2_windows.SimpleTextWindow;

public class TopBorderWindow extends SimpleTextWindow {
    @Override
    public void draw() {
        System.out.println("-----");
        super.draw();
    }
}
