class NSLList<T> {
    private NSLNode<T> head;

    public NSLList() {
        this.head = null;
    }

    public void addy(T data) {
        NSLNode<T> newNode = new NSLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            NSLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) {
        if (pos < 0 || head == null) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        NSLNode<T> temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        temp.next = temp.next.next;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        NSLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}
