class Solution {
    public String frequencySort(String s) {
 
        HashMap<Character,Integer> hm = new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        //step2. create a list and sort it
        List<Character>list=new ArrayList<>(hm.keySet());
        //own compartor to sort in dec order
        list.sort((a,b)->hm.get(b)-hm.get(a));
        //now run a loop till char length and append in answer;
        StringBuilder sb = new StringBuilder();
        for(char ch:list)
        {
            //ch ka length tak chalo by doing hm.get(ch) as hm me count hai uska
            for(int i=0;i<hm.get(ch);i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();


        

        
    }
}