class Solution {
    public int findComplement(int num) {
        //we know number+complement=all 1
        //so complement = 1 - number;
        int n=0;
        while(n<num)
        {
            n = ( n<<1 ) | 1;

        }
        return n-num;
    }
}
