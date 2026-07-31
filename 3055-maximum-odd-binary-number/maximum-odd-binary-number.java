class Solution {
    public String maximumOddBinaryNumber(String s) {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int n=ch.length;
        for(int i=n-1;i>=0;i--){
            if(ch[i]=='1'){
                char temp=ch[i];
                ch[i]=ch[n-1];
                ch[n-1]=temp;
                break;
                
            }
        }
        int left = 0;
        int right = n - 2;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}