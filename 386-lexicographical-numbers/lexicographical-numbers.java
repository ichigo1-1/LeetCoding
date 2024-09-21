class Solution {
    public void solve(int cur,int n,List<Integer>res)
    {
        //base case
        if(cur>n)
        {
            return;//if at any point the number exceeds the n
            //return    
        }
        res.add(cur);
        //next is to appned all the numbers from 0-9 in that number and explore
        for(int appending=0;appending<=9;appending++)
        {
            int current_number=(cur*10)+appending;
            if(current_number>n)
            {
                return;
            }
            //explore by appending that digit
            solve(current_number,n,res);
        }

    }
    public List<Integer> lexicalOrder(int n) {
        //our approach would be
        //1.pick the number from 1-9 with all possible combinations
        //1-9 because we would be further appending numbers from 0-9 inside that number also so no need to explore beyond 9 as all the reqd numbers would be included in that
        
        //next is to appned all the numbers from 0-9 in that number and explore
        //this could be summed up as an dfs questions as we are going in depth
        List<Integer>res=new ArrayList<>();
        //for each number from range 1-9 call the solve function which explores
        for(int start=1;start<=9;start++)
        {
            solve(start,n,res);
        }
        return res;
    }
}