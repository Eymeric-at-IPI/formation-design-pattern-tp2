package _3_iterator.arbre;


import _3_iterator.Iterable;
import _3_iterator.Iterator;

public class Arbre implements Iterable {

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

    @Override
    public Iterator createIterator() {
        return new ArbreIterator(this);
    }
}
