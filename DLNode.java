class DLNode {
    Song data;
    DLNode next;
    DLNode prev;

    public DLNode(Song data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
