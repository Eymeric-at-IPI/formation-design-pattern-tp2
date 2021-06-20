package list_linkedlist;

public interface MaList extends Iterable<String> {
    int size();
    void add(String valeur);
    void add(int position, String valeur);
    String get(int position);
}
