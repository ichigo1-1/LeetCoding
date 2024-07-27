class Solution {
    public void solve(int idx,StringBuilder temp,String s,List<String>res,Map<Character,String>mp)
    {
        //base case
        if(idx>=s.length())
        {
            res.add(temp.toString());
            return;
        }
        //get the current char
        char ch=s.charAt(idx);//2
        String str=mp.get(ch);//2->"abc"
        //now loop for all charaacters
        for(int i=0;i<str.length();i++)
        {
            temp.append(str.charAt(i));//a
            //now you need to combine this with 3->"def"
            //so call for idx+1
            solve(idx+1,temp,s,res,mp);
            temp.deleteCharAt(temp.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        Map<Character,String>mp=new HashMap<>();

        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        if(digits.length()==0)
        {
            return new ArrayList<>();
        }
        StringBuilder sb= new StringBuilder();
        solve(0,sb,digits,res,mp);
        return res;
    }
}