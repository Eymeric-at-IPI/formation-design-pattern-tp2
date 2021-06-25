package _3_iterator.arbre;

import _3_iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Arbre root = initTree();

        Iterator iterator = root.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }

    private static Arbre initTree() {
        /*
                a1
               /  \
              a2   a3
             / \     \
            a4  a5    a6
                 \
                  a7
         */

        Arbre leave7 = new Arbre();
        leave7.setValeur("leave7");

        Arbre leave5 = new Arbre();
        leave5.setValeur("leave5");
        leave5.setSousArbreDroit(leave7);

        Arbre leave4 = new Arbre();
        leave4.setValeur("leave4");

        Arbre leave2 = new Arbre();
        leave2.setValeur("leave2");
        leave2.setSousArbreGauche(leave4);
        leave2.setSousArbreDroit(leave5);

        Arbre leave6 = new Arbre();
        leave6.setValeur("leave6");

        Arbre leave3 = new Arbre();
        leave3.setValeur("leave3");
        leave3.setSousArbreDroit(leave6);

        Arbre root = new Arbre();
        root.setValeur("root");
        root.setSousArbreGauche(leave2);
        root.setSousArbreDroit(leave3);

        return root;
    }

}
