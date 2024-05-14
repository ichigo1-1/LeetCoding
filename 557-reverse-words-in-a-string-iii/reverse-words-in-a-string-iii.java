class Solution {
    public String reverseWords(String s) {
        String[]words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            sb.append(rev(words[i]));
            if(i!=words.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public String rev(String s)
    {
        int i=0;
        int j=s.length()-1;
        char[]arr=s.toCharArray();
        while(i<j)
        {
            char ch=arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
        }
        return new String(arr);
    }
}