package _3_iterator;

public class MaLinkedListString implements Iterable {

    private Cellule premiere;
    private Cellule derniere;

    public void add(String s) {
        Cellule cellule = new Cellule(s, derniere, null);
        if (derniere != null)
            derniere.setSuivante(cellule);

        this.derniere = cellule;
        if (premiere == null) {
            this.premiere = cellule;
        }
    }

    public int count() {
        int count = 0;
        Cellule suivant = premiere;
        while (suivant != null) {
            suivant = suivant.getSuivante();
            count++;
        }
        return count;
    }

    public String get(int position) {
        int count = 0;
        Cellule suivant = premiere;
        while (count != position) {
            suivant = suivant.getSuivante();
            count++;
        }
        return suivant.getValeur();
    }

    @Override
    public Iterator createIterator() {
        return new MaLinkedListStringIterator(this);
    }
}
