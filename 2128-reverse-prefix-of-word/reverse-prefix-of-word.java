class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }
        StringBuffer sub=new StringBuffer(word.substring(0,index+1));
        
        sub.reverse();

        return sub.toString()+word.substring(index+1);
    }
}