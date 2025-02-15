class NDLNode<T> {
    T data;
    NDLNode<T> next;
    NDLNode<T> prev;

    public NDLNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
