class Solution {
    public boolean hasSameDigits(String s) {

        while(s.length()>2){
            s=opration(s);
        }

        return s.charAt(0)==s.charAt(1);
        
    }

    String opration(String str){
        StringBuilder ans=new StringBuilder();
        


        for(int i=0;i<str.length()-1;i++){
            int num1=str.charAt(i)-'0';
            int num2=str.charAt(i+1)-'0';
            int sum=(num1+num2)%10;
            ans.append(sum);
        }
        return ans.toString();
    }
}