package _3_iterator;

public class MaLinkedListeStringIterator implements Iterator {
    private MaLinkedListeString maLinkedListString;
    private int currentPosition;

    public MaLinkedListeStringIterator(MaLinkedListeString maLinkedListString) {
        this.maLinkedListString = maLinkedListString;
        this.currentPosition = 0;
    }

    @Override
    public String getNext() {
        if(!hasNext()) return null;

        String result = maLinkedListString.get(this.currentPosition);
        this.currentPosition++;

        return result;
    }

    @Override
    public boolean hasNext() {
        return this.maLinkedListString.count() > this.currentPosition;
    }
}
