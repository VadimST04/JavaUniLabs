// Create a custom stack
import java.util.ArrayList;

class MyStack<T> {
    private final ArrayList<T> stackArray = new ArrayList<>();

    public void push(T item) {
        stackArray.add(item);
    }

    public T pop() {
        return stackArray.remove(stackArray.size() - 1);
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public void clean() {
        stackArray.clear();
    }

    public int size() {
        return stackArray.size();
    }

    public T top() {
        return stackArray.get(stackArray.size() - 1);
    }
}

public class Lab4 {
    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        s.push(12);
        s.push(14);
        s.push(15);
        System.out.println("Is empty: " + s.isEmpty());
        System.out.println("Count: " + s.size());
        System.out.println("Last item: " + s.size());
    }
}
