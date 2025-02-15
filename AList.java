class AList<S> {
    private Book[] books;
    private int size;
    private static final int maxSize = 10;

    public AList() {
        books = new Book[maxSize];
        size = 0;
    }

    private void resize() {
        int newCapacity = books.length * 2;
        Book[] newBooks = new Book[newCapacity];
        System.arraycopy(books, 0, newBooks, 0, size);
        books = newBooks;
    }

    public void addy(Book b) {
        if (size == books.length) {
            resize();
        }
        books[size++] = b;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (int i = pos; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        books[--size] = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(books[i]).append("\n");
        }
        return sb.toString();
    }
}
