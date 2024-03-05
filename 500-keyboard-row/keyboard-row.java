class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiopQWERTYUIOP";
        String r2="asdfghjklASDFGHJKL";
        String r3="zxcvbnmZXCVBNM";

        List<String>res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            boolean ro1=true,ro2=true,ro3=true;
            for(int j=0;j<words[i].length();j++)
            {
                char c=words[i].charAt(j);
                if(!r1.contains(String.valueOf(c)))
                {
                    ro1=false;
                }
                if(!r2.contains(String.valueOf(c)))
                {
                    ro2=false;
                }
                 if(!r3.contains(String.valueOf(c)))
                {
                    ro3=false;
                }
            }
            if(ro1 || ro2 || ro3)
            {
                res.add(words[i]);
            }
        }
        String []s=res.toArray(new String[0]);
        return s;

        
    }
}

