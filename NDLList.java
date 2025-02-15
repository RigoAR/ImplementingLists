class NDLList<T> {
    private NDLNode<T> head;
    private NDLNode<T> tail;

    public NDLList() {
        this.head = null;
        this.tail = null;
    }

    public void addy(T data) {
        NDLNode<T> newNode = new NDLNode<>(data);
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
        NDLNode<T> temp = head;
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
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        NDLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}

