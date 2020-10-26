package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        this.data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        data.add(val);
        return true;
    }

    @Override
    public T pop() {
        // homework
        if (data.size() == 0) {
            return null;
        }
        return data.removeLast();
    }

    @Override
    public T peek() {
        // homework
        if (data.size() == 0) {
            return null;
        }
        return data.getLast();
    }

    @Override
    public int size() {
        return data.size();
    }
}
