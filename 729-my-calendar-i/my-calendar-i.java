class MyCalendar {
    TreeSet<int[]>arr;
    public MyCalendar() {
        arr=new TreeSet<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
    }
    
    public boolean book(int start, int end) {
        //add karo
        int[]event=new int[]{start,end};
        int[] next=arr.ceiling(event);
        //check the next for overlapping
        if(next!=null && next[0]<end)
        {
            return false;
        }
        //check if it overlaps with previous element
        int[]prev=arr.floor(event);
        if(prev!=null && prev[1]>start)
        {
            return false;
        }
        arr.add(event);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */