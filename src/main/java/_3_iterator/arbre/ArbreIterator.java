package _3_iterator.arbre;

import _3_iterator.Iterator;
import java.util.Stack;


public class ArbreIterator implements Iterator {

    private Arbre arbre;
    private int currentPosition;
    private Stack<Arbre> previousNodes;

    public ArbreIterator(Arbre arbre) {
        this.arbre = arbre;
        this.currentPosition = 0;
        this.previousNodes = new Stack<>();
        this.previousNodes.clear();

        // Init stack with all left side
        Arbre currentArbre = arbre;
        while (currentArbre != null) {
            this.previousNodes.push(currentArbre);
            currentArbre = currentArbre.getSousArbreGauche();
        }
    }

    @Override
    public String getNext() {
        // Last added leave
        Arbre currentArbre = this.previousNodes.pop();
        String resulat = currentArbre.getValeur();

        // Has right leave ?
        if((currentArbre = currentArbre.getSousArbreDroit()) != null) {
            // Get all left leave of the new node
            do {
                this.previousNodes.push(currentArbre);
                currentArbre = currentArbre.getSousArbreGauche();
            } while(currentArbre != null);
        }

        return resulat;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return !this.previousNodes.empty();
    }
}