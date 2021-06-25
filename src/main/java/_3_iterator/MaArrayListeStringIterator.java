package _3_iterator;

public class MaArrayListeStringIterator implements Iterator, java.util.Iterator<String> {

    private MaArrayListeString maListeString;

    private int position = 0;

    public MaArrayListeStringIterator(MaArrayListeString maListeString) {
        this.maListeString = maListeString;
    }

    @Override
    public String getNext() {
        return maListeString.get(position++);
    }

    @Override
    public boolean hasNext() {
        return maListeString.count() > position;
    }



    @Override
    public String next() {
        return  maListeString.get(position++);
    }
}
