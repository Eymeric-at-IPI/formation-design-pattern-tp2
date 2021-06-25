package _5_visitor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        ExportVisitor exportVisitor = new ExportVisitor();

        List<PointDInteret> allPOIs = new ArrayList<>(); //TODO remplir

        for (PointDInteret poi : allPOIs) {
            poi.accept(exportVisitor);
        }

    }
}
