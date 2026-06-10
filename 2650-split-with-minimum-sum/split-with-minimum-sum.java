class Solution {
    public int splitNum(int num) {
        String str=num+"";
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        String num1="";
        for(int i=0;i<ch.length;i+=2){
            num1=num1+ch[i];
        }
        String num2="";
        for(int i=1;i<ch.length;i+=2){
            num2=num2+ch[i];
        }
        return Integer.parseInt(num1)+Integer.parseInt(num2);
        
    }
}