public interface tackInterface {
    void push(int element);
    int pop();
}
public class stack implements stackInterface {
    private int[] array;
    private int top;
    private int capacity;

    public stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top < capacity - 1) {
            array[++top] = element;
            System.out.println("Pushed " + element);
        } else {
            System.out.println("Stack is full!");
        }
    }

    @Override
    public int pop() {
        if (top >= 0) {
            int element = array[top];
            top--;
            System.out.println("Popped " + element);
            return element;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
}
public class interface {
    public static void main(String[] args) {
        stack myStack = new stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.pop();
        myStack.pop();
    }
}