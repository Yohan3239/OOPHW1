public class LinkedList {
    int head;
    LinkedList tail;
    LinkedList(int Head, LinkedList Tail) {
        head = Head;
        tail = Tail;
    }
    public int getHead() {
        return head;
    }
    public void add(int value) {
        if (tail == null) {
            tail = new LinkedList(value, null);
        } else tail.add(value);
    }
    public void remove(int value) {
        if (tail != null) {
            if (tail.head == value) {
                tail = tail.tail;
            } else tail.remove(value);
        }
    }
    public int nthElement(int n) {
        if (n == 0) {
            return head;
        } else {
            if (tail != null) {
                return tail.nthElement(n - 1);
            } else throw new IndexOutOfBoundsException("Out of bounds");
        }
    }
    public int lengthOfList() {
        if (head == null) return 0;
        else if (tail == null) {
            return 1;
        } else {
            return 1 + tail.lengthOfList();
        }
    }
}
