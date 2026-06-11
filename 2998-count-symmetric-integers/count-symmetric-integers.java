class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low ;i<=high;i++){
            String str=Integer.toString(i);
            int length=str.length();

            if(length%2 !=0) continue;

            int left=0,right=0;

            for(int j=0;j<length/2;j++){
                left+=str.charAt(j)-'0';
            }
            for(int k=length/2;k<length;k++){
                right+=str.charAt(k)-'0';
            }

            if(left==right){
                count++;
            }
            

        }
        return count;
    }
}