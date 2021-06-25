package _3_iterator;

import java.io.PrintStream;
import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        MaLinkedListeString maListeString = new MaLinkedListeString();

        maListeString.add("toto");
        maListeString.add("tata");
        maListeString.add("tata1");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata2");
        maListeString.add("tata");
        maListeString.add("tat5a");
        maListeString.add("tata8");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tat7a");

        Iterator iterator = maListeString.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}