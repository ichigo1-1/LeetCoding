class Solution {
    public int numberOfCuts(int n) {
        //pattern should be observed for 1 and 0  number itself
        //for even----> n/2 ex--> 4-->n/2=2 cuts;
        //for odd-->n ex:- 5--> 5 cuts
        if(n<=1)
        {
            return 0;
        }
        if(n%2==0)
        {
            return n/2;
        }
        return n;
        
    }
}