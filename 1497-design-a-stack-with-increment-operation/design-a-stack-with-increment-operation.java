class CustomStack {
    int[]arr;
    int size;
    int tos=-1;
    public CustomStack(int maxSize) {
        size=maxSize;
        arr=new int[size];
    }
    
    public void push(int x) {
        if(tos<arr.length-1)
        {
            arr[++tos]=x;
        }
    }
    
    public int pop() {
        if(tos!=-1)
        {
            int val=arr[tos];
            tos--;
            return val;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int count = k>arr.length?arr.length:k;
        while(count-->0)
        {
            arr[count]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */