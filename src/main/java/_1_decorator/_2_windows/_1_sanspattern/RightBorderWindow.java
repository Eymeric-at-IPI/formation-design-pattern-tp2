package _1_decorator._2_windows._1_sanspattern;

import _1_decorator._2_windows.SimpleTextWindow;

public class RightBorderWindow extends SimpleTextWindow {
    @Override
    public void draw() {
        super.draw();
        System.out.print("|");
    }
}
