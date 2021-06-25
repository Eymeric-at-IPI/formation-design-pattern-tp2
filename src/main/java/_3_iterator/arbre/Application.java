package _3_iterator.arbre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Arbre a1 = new Arbre();
        a1.setValeur("a1");

        Arbre a2 = new Arbre();
        a2.setValeur("a2");

        Arbre a3 = new Arbre();
        a3.setValeur("a3");

        Arbre a4 = new Arbre();
        a4.setValeur("a4");

        a1.setSousArbreGauche(a2);
        a1.setSousArbreDroit(a3);

        a3.setSousArbreDroit(a4);

        parcourir(a1);

        for (Iterator<Arbre> iterator = a1.iterator(); iterator.hasNext(); ) {
            Arbre arbre = iterator.next();
            System.out.println(arbre.getValeur());
        }

        for (Arbre a : a1) {
            System.out.println(a.getValeur());
        }
    }

    private static void parcourirRecurrssif(Arbre a) {
        System.out.println(a.getValeur());

        if (a.getSousArbreGauche() != null)
            parcourir(a.getSousArbreGauche());

        if (a.getSousArbreDroit() != null)
            parcourir(a.getSousArbreDroit());
    }


    private static void parcourir(Arbre arbre) {
        List<Arbre> arbres = new ArrayList<>();
        arbres.add(arbre);

        while (!arbres.isEmpty()) {
            Arbre a = arbres.remove(0);
            System.out.println(a.getValeur());

            if (a.getSousArbreGauche() != null)
                arbres.add(a.getSousArbreGauche());

            if (a.getSousArbreDroit() != null)
                arbres.add(a.getSousArbreDroit());
        }
    }
}
