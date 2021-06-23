package _1_decorator._2_windows._1_sanspattern;

import _1_decorator._2_windows.Window;

public class SampleUsage {

    public static void main(String[] args) {
        System.out.println("TopBorderWindow");
        Window topBorderWindow = new TopBorderWindow();
        topBorderWindow.draw();

        System.out.println();
        System.out.println();

        System.out.println("LeftBorderWindow");
        Window leftBorderWindow = new LeftBorderWindow();
        leftBorderWindow.draw();

        System.out.println();
        System.out.println();

        System.out.println("TopRightBorderWindow");
        Window topRightBorderWindow = new TopRightBorderWindow();
        topRightBorderWindow.draw();


        System.out.println();
        System.out.println();

        System.out.println("Et BottomLeft ... TopLeftRight ... ???");
        System.out.println("On crée une classe pour chaque comibinaison");
    }

}
