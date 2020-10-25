package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    public ArrayStack(int capacity) {
        // homework
        if (capacity > 0) {
            this.data = (T[]) new Object[capacity];
        }
        this.size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if (size == data.length) {
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public T pop() {
        // homework
        if (size == 0) {
            return null;
        }
        T value = data[size - 1];
        size--;
        return value;
    }

    @Override
    public T peek() {
        // homework
        if (size == 0) {
            return null;
        }
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }
}
