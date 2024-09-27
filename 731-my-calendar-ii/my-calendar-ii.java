class Pair{
    int first;
    int second;
    Pair(int f,int s)
    {
        first=f;
        second=s;
    }
}
class MyCalendarTwo {
    ArrayList<Pair>doublebookings=new ArrayList<>();
    ArrayList<Pair>bookings=new ArrayList<>();
    public MyCalendarTwo() {
        
    }
    public boolean checkoverlap(int start1,int end1,int start2,int end2)
    {
        return Math.max(start1,start2)<Math.min(end1,end2);//min ending se pehle ek start chalu ho rai this tells overlapping
    }
    public Pair overlappedregion(int start1,int end1,int start2,int end2)
    {
        return new Pair(Math.max(start1,start2),Math.min(end1,end2));
    }
    public boolean book(int start, int end) {
        //check if the coming overlaps with any double bookings
        for(Pair p:doublebookings)
        {
            if(checkoverlap(p.first,p.second,start,end))
            {
                return false;//as it overlaps
            }
        }
        //check if any double bookings are created
        for(Pair x:bookings)
        {
            if(checkoverlap(x.first,x.second,start,end))
            {
                Pair overlap = overlappedregion(x.first, x.second, start, end);
                doublebookings.add(overlap);
            }
        }
        //book it
        bookings.add(new Pair(start,end));
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */