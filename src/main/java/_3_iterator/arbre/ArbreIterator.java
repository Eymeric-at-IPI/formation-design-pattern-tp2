package _3_iterator.arbre;

import _3_iterator.Iterator;

public class ArbreIterator implements Iterator {

    private Arbre arbre;

    public ArbreIterator(Arbre arbre) {
        this.arbre = arbre;
    }

    @Override
    public String getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return false;
    }
}


/*

TODO :

comment passer au suivant ?
c'est quoi le suivant ?

 */