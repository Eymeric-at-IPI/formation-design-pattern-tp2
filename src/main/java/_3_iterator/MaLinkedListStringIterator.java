package _3_iterator;

public class MaLinkedListStringIterator implements Iterator {
    private MaLinkedListString maLinkedListString;

    public MaLinkedListStringIterator(MaLinkedListString maLinkedListString) {
        this.maLinkedListString = maLinkedListString;
    }

    @Override
    public String getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
