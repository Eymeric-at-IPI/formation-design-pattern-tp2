package _3_iterator;

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        MaArrayListeString maListeString = new MaArrayListeString();

        maListeString.add("toto");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        System.out.println(maListeString.count());
        System.out.println(maListeString.get(1));

        for (String value : maListeString) {
            System.out.println(value);
        }

        for (int i = 0; i < maListeString.count(); i++) {
            System.out.println(maListeString.get(i));
        }

        for (Iterator iterator = maListeString.createIterator(); iterator.hasNext(); ) {
            String elem = iterator.getNext();
        }


        System.out.println("------- MaLinkedListString -------");
        MaLinkedListString maLinkedListString = new MaLinkedListString();
        maLinkedListString.add("A");
        maLinkedListString.add("B");
        maLinkedListString.add("C");
        System.out.println(maLinkedListString.get(0));
        System.out.println(maLinkedListString.get(1));
        System.out.println(maLinkedListString.get(2));


        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        for (String e : set) {

        }
        for (java.util.Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String elem = iterator.next();
        }
    }
}
