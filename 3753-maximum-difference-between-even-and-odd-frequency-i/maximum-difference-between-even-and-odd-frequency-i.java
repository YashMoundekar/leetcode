class Solution {
    public int maxDifference(String s) {
        int fre[]=new int[101];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                fre[ch-'a']++;  
        }
        int a1=Integer.MAX_VALUE;
        int a2=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<fre.length;i++){
            if(fre[i]==0)
            continue;
            if(fre[i]%2==0 ){
                a1=Math.min(a1,fre[i]);
            }else { 
                a2=Math.max(a2,fre[i]);
            }
        }
           
        return  a2-a1;
    }
}