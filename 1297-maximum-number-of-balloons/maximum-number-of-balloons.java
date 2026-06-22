class Solution {
    public int maxNumberOfBalloons(String text) {

        char ch[]=text.toCharArray();
        int ans=0;
        while(true){
            String word="balloon";

            for(char c:word.toCharArray()){
                boolean flag=true;

                for(int i=0;i<ch.length;i++){

                    if(ch[i]==c){
                        ch[i]='#';
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    return ans;
                }
            }
            ans++;
        }
        
    }
}