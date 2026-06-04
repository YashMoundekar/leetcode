class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=wiveness(i);
        }
        return ans;
    }
    int wiveness(int num){
        String str=Integer.toString(num);
        int count=0;
        char ch[]=str.toCharArray();

        for(int i=1;i<ch.length-1;i++){
            
            if((ch[i]>ch[i-1] && ch[i]>ch[i+1]) 
            || (ch[i]<ch[i-1] && ch[i]<ch[i+1]) ){
                count++;
            }
        }
        return count;
    }
}