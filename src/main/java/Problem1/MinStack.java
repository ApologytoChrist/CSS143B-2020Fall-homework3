package Problem1;

public class MinStack<T> extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private ArrayStack<Integer> minStack;
    private Integer minElement;

    public MinStack(int size) {
        // homework
        super(size);
        if (size > 0) {
            minStack = new ArrayStack<Integer>(size);
        }
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if (minStack.size() == 0) {
            minElement = val;
        } else if (val < minElement) {
            minElement = val;
        }
        minStack.push(minElement);
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        if ()
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return null;
    }
}

