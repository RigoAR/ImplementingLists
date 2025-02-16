class NAList<T> {
    private Object[] array;
    private int size;
    private static final int maxSize = 10;

    public NAList() {
        array = new Object[maxSize];
        size = 0;
    }

    public void addy(T data) {
        if (size == array.length) {
            resize();
        }
        array[size++] = data;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append("\n");
        }
        return sb.toString();
    }
}