class Solution {
    public String maximumOddBinaryNumber(String s) {
    char[] arr = s.toCharArray();
    int n = s.length();
    Arrays.fill(arr,'0');
    int index=0;
    int count=0;
    //count 1s
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='1')
        {
            count++;
        }
    }
    arr[n-1]='1';
    count--;
    while(count>0)
    {
        arr[index++]='1';
        count--;
    }
    return new String(arr);
    }
}