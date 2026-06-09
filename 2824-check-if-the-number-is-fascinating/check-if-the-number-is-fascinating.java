class Solution {
    public boolean isFascinating(int n) {
        String res = String.valueOf(n) +
                     String.valueOf(2 * n) +
                     String.valueOf(3 * n);

        if (res.length() != 9) {
            return false;
        }

        for(int i=1;i<=9;i++){
            int count=0;
            for(int j=0;j<res.length();j++){
                if(i==res.charAt(j)-'0'){
                    count++;
                }
            }
            if(count>1){
                return false;
            }
        }
    return !res.contains("0");
        
    }
}