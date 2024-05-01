class Solution {
    public String decodeAtIndex(String s, int k) {

        //algo
        //find the size
        //start from end and check wheter divsior of k=k%Size ==0 
        //if yes return

      
        // //step 1:
        int n = s.length();
        long len = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                len = len * (ch - '0');
            }else{
                len++;
            }
        }

        

        //step 2: Travserse from end as ans may always lie in the back
        //beacuse we dont need to build the whole string if im using modulo
         for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isDigit(c)){//it doesnt matter if modulo comes out to be 0 also as it is a digit it will never be my answer
                len = len / (c - '0'); 
                k %= len;
            }
            else {
                if(k == 0 || k == len) return Character.toString(c);
                len --;//always reduce by 1 in case of a letter
            }
        }
        return "";
    }
}





