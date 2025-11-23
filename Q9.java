class Stack {
    LinkedList stack;
    public int peek() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack is empty");
        return stack.getHead();
    }
    public void push(int value) {
        stack = new LinkedList(value, stack);
    }
    public int pop() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack is empty");
        int value = stack.getHead();
        stack = stack.tail;
        return value;
    }
    public boolean isEmpty() {
        return stack == null;
    }
    public int size() {
        return stack.lengthOfList();
    }
}
