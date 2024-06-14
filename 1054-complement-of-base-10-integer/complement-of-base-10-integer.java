class Solution {
    public int bitwiseComplement(int num) {
        int n=0;
        if(num==0)
        {
            return 1;
        }
        while(n<num)
        {
            n=(n<<1)|1;
        }
        return n-num;
    }
}