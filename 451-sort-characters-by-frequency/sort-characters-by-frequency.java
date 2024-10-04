class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer>hm=new TreeMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character>ls=new ArrayList<>(hm.keySet());
        ls.sort((a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:ls)
        {
            for(int i=0;i<hm.get(ch);i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}