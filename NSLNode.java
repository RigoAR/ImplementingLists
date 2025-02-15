class NSLNode<T> {
    T data;
    NSLNode<T> next;

    public NSLNode(T data) {
        this.data = data;
        this.next = null;
    }
}