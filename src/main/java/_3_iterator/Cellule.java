package _3_iterator;

public class Cellule {

    private String valeur;
    private Cellule precedente;
    private Cellule suivante;

    public Cellule(String valeur, Cellule precedente, Cellule suivante) {
        this.valeur = valeur;
        this.precedente = precedente;
        this.suivante = suivante;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Cellule getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Cellule precedente) {
        this.precedente = precedente;
    }

    public Cellule getSuivante() {
        return suivante;
    }

    public void setSuivante(Cellule suivante) {
        this.suivante = suivante;
    }
}
