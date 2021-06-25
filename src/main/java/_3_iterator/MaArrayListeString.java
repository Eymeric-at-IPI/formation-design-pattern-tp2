package _3_iterator;

public class MaArrayListeString implements Iterable, java.lang.Iterable<String> {

    private String[] array = new String[10];
    private int count = 0;

    public void add(String s) {
        if (this.count == this.array.length) {
            String[] array2 = new String[this.array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                array2[i] = this.array[i];
            }
            this.array = array2;
        }
        this.array[count] = s;
        this.count = this.count + 1;
    }

    public int count() {
        return this.count;
    }

    public String get(int position) {
        return this.array[position];
    }

    @Override
    public Iterator createIterator() {
        return new MaArrayListeStringIterator(this);
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new MaArrayListeStringIterator(this);
    }

}
