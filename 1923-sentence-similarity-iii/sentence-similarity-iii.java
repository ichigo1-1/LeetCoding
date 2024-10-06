class Solution {

    public boolean areSentencesSimilar(String s1, String s2) {
        //as were checking emptiness of d2 in case s2>s1 our approach would fail
        //so incase we swap
        if(s2.length()>s1.length())
        {
            String tempo = s1;
            s1 = s2;
            s2 = tempo;
        }
        Deque<String>d1=new LinkedList<>(Arrays.asList(s1.split(" ")));
        Deque<String>d2=new LinkedList<>(Arrays.asList(s2.split(" ")));
        //check prefix mathes
        while(!d1.isEmpty() && !d2.isEmpty()&&d1.peekFirst().equals(d2.peekFirst()))
        {
            d1.pollFirst();
            d2.pollFirst();
        }
        //check suffix matches
        while(!d1.isEmpty() && !d2.isEmpty()&&d1.peekLast().equals(d2.peekLast()))
        {
            d1.pollLast();
            d2.pollLast();
        }
        if(d2.isEmpty())
        {
            return true;
        }
        return false;
    }
}