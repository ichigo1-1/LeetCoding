class Solution {
    public String[] findWords(String[] words) {
        // Define rows of characters on the keyboard
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        // Add characters to respective rows
        for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) {
            row1.add(c);
        }
        for (char c : "asdfghjklASDFGHJKL".toCharArray()) {
            row2.add(c);
        }
        for (char c : "zxcvbnmZXCVBNM".toCharArray()) {
            row3.add(c);
        }

        List<String> res = new ArrayList<>();
        for (String word : words) {
            boolean ro1 = true, ro2 = true, ro3 = true;
            for (char c : word.toCharArray()) {
                if (!row1.contains(c)) {
                    ro1 = false;
                }
                if (!row2.contains(c)) {
                    ro2 = false;
                }
                if (!row3.contains(c)) {
                    ro3 = false;
                }
            }
            if (ro1 || ro2 || ro3) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
// class Solution {
//     public String[] findWords(String[] words) {
//         String r1="qwertyuiopQWERTYUIOP";
//         String r2="asdfghjklASDFGHJKL";
//         String r3="zxcvbnmZXCVBNM";

//         List<String>res=new ArrayList<>();
//         for(int i=0;i<words.length;i++)
//         {
//             boolean ro1=true,ro2=true,ro3=true;
//             for(int j=0;j<words[i].length();j++)
//             {
//                 char c=words[i].charAt(j);
//                 if(!r1.contains(String.valueOf(c)))
//                 {
//                     ro1=false;
//                 }
//                 if(!r2.contains(String.valueOf(c)))
//                 {
//                     ro2=false;
//                 }
//                  if(!r3.contains(String.valueOf(c)))
//                 {
//                     ro3=false;
//                 }
//             }
//             if(ro1 || ro2 || ro3)
//             {
//                 res.add(words[i]);
//             }
//         }
//         String []s=res.toArray(new String[0]);
//         return s;

        
//     }
// }

