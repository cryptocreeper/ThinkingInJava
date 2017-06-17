package chapter11_collections.task22;

class Word {
    private String word;
    private int count;

    Word(String word) {
        this.word = word;
        count = 1;
    }

    String getWord() {
        return word;
    }

    void increaseCount() {
        count++;
    }

    @Override
    public String toString() {
        return word + ": " + count;
    }
}
