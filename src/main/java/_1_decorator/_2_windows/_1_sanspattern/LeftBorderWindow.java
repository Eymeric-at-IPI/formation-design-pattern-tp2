package _1_decorator._2_windows._1_sanspattern;


import _1_decorator._2_windows.SimpleTextWindow;

public class LeftBorderWindow extends SimpleTextWindow {
    @Override
    public void draw() {
        System.out.print("|");
        super.draw();
    }
}
