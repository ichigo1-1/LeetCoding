class Solution {
    public boolean rotateString(String s, String goal) {
        
        //contains method can be used
        //well concatinate
        //ex:- abcde + abcde ="abcdeabcde"
        //now we can have all the substring if we start eliminating 1-1 char from left:: bcdea,cdeab etc.etc

        //the length of goal and substring should also be same
        if(s.length()!=goal.length())
        {
            return false;
        }
        s+=s;
        return s.contains(goal);
    }
}