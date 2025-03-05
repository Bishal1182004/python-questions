import java.util.EmptyStackException;

public class stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        stack myStack = new stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element is: " + myStack.peek());
        System.out.println("Popped element is: " + myStack.pop());
        System.out.println("Top element after pop is: " + myStack.peek());
    }
}
