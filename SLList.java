class SLList<S> {
    private SLNode head;

    public SLList() {
        this.head = null;
    }

    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            SLNode temp = head;
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
        SLNode temp = head;
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
        StringBuilder sb = new StringBuilder();
        SLNode temp = head;
        while (temp != null) {
            sb.append(temp.data).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}