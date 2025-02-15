class DLList<S> {
    private DLNode head;
    private DLNode tail;

    public DLList() {
        this.head = null;
        this.tail = null;
    }

    public void addy(Song s) {
        DLNode newNode = new DLNode(s);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removy(int pos) {
        if (pos < 0 || head == null) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        DLNode temp = head;
        for (int i = 0; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
