class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>();
        Queue<Integer>q=new LinkedList<>();
        
        //adding to queue
        for(int stu:students)
        {
            q.add(stu);
        }
        //adding to stack
        for(int it:sandwiches)
        {
            //we need to push from back acc to question as first need to be at top
            for(int i=sandwiches.length-1;i>=0;i--)
            {
                st.push(sandwiches[i]);
            }
        }
        //a counter for served
        int served=0;

        //main condition
        while(!q.isEmpty() && served<q.size())
        {
            if(st.peek().equals(q.peek()))
            {
                st.pop();
                q.poll();
                served=0;
            }
            //push back to the queue and remove from front
            else{
                q.add(q.peek());
                q.poll();
                served++;
            }
        }
        //the remaining ones at queue are the left ones as served<q.size()
        return q.size();

        
    }
}

        
       