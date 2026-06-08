class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        char ch[]=stones.toCharArray();
        char c[]=jewels.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){

            for(int j=0;j<c.length;j++){

                if(ch[i]==c[j]){
                    count++;
                }
            }

        }
        return count;
        
    }
}