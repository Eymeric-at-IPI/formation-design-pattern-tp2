package _1_decorator._2_windows._1_sanspattern;

import _1_decorator._2_windows.SimpleTextWindow;

public class BottomBorderWindow extends SimpleTextWindow {
    @Override
    public void draw() {
        super.draw();
        System.out.println();
        System.out.println("-----");
    }
}
