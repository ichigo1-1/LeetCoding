
class Solution {
    class TrieNode{
    int countP=0;
    TrieNode[]children=new TrieNode[26];

    public TrieNode(){  
        countP=0;
        for(int i=0;i<26;i++)
        {
            children[i]=null;
        }
    }
    //to create a new trienode if the current char is not present
    public TrieNode createTrie(){
        return new TrieNode();
    }
    //to insert a word into the trie
    public void insert(String word,TrieNode root){
        TrieNode crawl=root;
        for(char ch:word.toCharArray())
        {
            int index=ch-'a';
            if(crawl.children[index]==null)
            {
                crawl.children[index]=createTrie();
            }
            //now increase the count of prefix
            crawl.children[index].countP+=1;
            //move crawl
            crawl=crawl.children[index];
        }
    }
    //to get the score of a word
    public int score(String word,TrieNode root)
    {
        TrieNode crawl=root;
        int score=0;
        //now check chars by char
        for(char ch:word.toCharArray())
        {
            int index=ch-'a';
            score+=crawl.children[index].countP;
            //move crawl
            crawl=crawl.children[index];
        }
        return score;
    }
}
    public int[] sumPrefixScores(String[] words) {
        int n=words.length;
        //create a root node to work with
        TrieNode root=new TrieNode();
        //insert all word to trie
        for(String word:words)
        {
            root.insert(word,root);
        }
        //create a res array to store the result
        int[]res=new int[n];
        //calculate scores
        for(int i=0;i<n;i++)
        {
            res[i]=root.score(words[i],root);
        }
        return res;
    }
    
}
