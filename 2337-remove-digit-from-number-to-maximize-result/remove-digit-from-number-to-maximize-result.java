class Solution {
    public String removeDigit(String number, char digit) {
        int c=0;
        String max="";
        for(int i=0;i<number.length();i++)
        {
            char ch=number.charAt(i);
            StringBuilder sb=new StringBuilder(number);
            if(ch==digit)
            {
                sb.deleteCharAt(i);
                String current=sb.toString();
                if(current.compareTo(max)>0)
                {
                    max=current;
                }
            }
            
        }
        return max;

    }
}