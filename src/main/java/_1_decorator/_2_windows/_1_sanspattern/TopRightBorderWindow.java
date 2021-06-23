package _1_decorator._2_windows._1_sanspattern;

public class TopRightBorderWindow extends RightBorderWindow {

    @Override
    public void draw() {
        System.out.println(" -----");
        super.draw();
    }
}
