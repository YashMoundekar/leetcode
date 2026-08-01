class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        for(int i=0;i<words1.length;i++){
            int fre=0,fre1=0;
            for(int j=0;j<words1.length;j++){
                if(words1[i].equals(words1[j])){
                    fre++;
                }
            }
            for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j])){
                    fre1++;
                }
            }
            if(fre==1 && fre1==1){
                count++;
            }
        }
        return count;
    }
}