class MyCircularDeque {
    Deque<Integer> deque;
    int size;
    public MyCircularDeque(int k) {
        deque=new ArrayDeque<>(k);
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(deque.size()<size)
        {
            deque.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(deque.size()<size)
        {
            deque.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!deque.isEmpty())
        {
            deque.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!deque.isEmpty())
        {
            deque.removeLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        if(!deque.isEmpty())
        {
            return deque.peekFirst();
        }
        return -1;
    }
    
    public int getRear() {
         if(!deque.isEmpty())
        {
            return deque.peekLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public boolean isFull() {
        return deque.size()==size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */