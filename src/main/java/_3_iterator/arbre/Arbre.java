package _3_iterator.arbre;

import java.util.Iterator;

public class Arbre implements Iterable<Arbre> {

    private String valeur;
    private Arbre sousArbreGauche;
    private Arbre sousArbreDroit;

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Arbre getSousArbreGauche() {
        return sousArbreGauche;
    }

    public void setSousArbreGauche(Arbre sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public Arbre getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreDroit(Arbre sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }

    public Iterator<Arbre> iterator() {
        return new ArbreIterator(this);
    }
}
