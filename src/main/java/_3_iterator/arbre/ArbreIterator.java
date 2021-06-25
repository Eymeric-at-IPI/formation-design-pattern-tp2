package _3_iterator.arbre;

import java.util.Iterator;

public class ArbreIterator implements Iterator<Arbre> {

    private Arbre arbre;

    public ArbreIterator(Arbre arbre) {
        this.arbre = arbre;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return false;
    }

    @Override
    public Arbre next() {
        //TODO
        return null;
    }
}
