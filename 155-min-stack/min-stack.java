import java.util.Stack;

class MinStack {
    Stack<Integer> ad;
    Stack<Integer> md;

    public MinStack() {
        ad = new Stack<>();
        md = new Stack<>();
    }

    public void push(int val) {
        ad.push(val);
        // to push in min data
        // agar kuch nahi hai tbto karo hi
        if (md.isEmpty() || val <= md.peek()) {
            md.push(val);
        }

    }

    public void pop() {
        if (!ad.isEmpty()) {
            int val = ad.pop();
            if (val == md.peek()) {
                md.pop();
            }
        }
    }

    public int top() {
        if (ad.isEmpty()) {
            return -1;
        } else {
            return ad.peek();
        }

    }

    public int getMin() {
        if (md.isEmpty()) {
            return -1; // or return Integer.MAX_VALUE;
        } else {
            return md.peek();
        }

    }
}
