class Solution {
    public String sortSentence(String s) {

        String str[]=s.split(" ");
        String res[]=new String[str.length];

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length;i++){
           int idx=str[i].charAt(str[i].length()-1)-'0';
            res[idx-1]=str[i].substring(0,str[i].length()-1);
        }

        for(int i=0;i<res.length;i++){
            sb.append(res[i]);

            if (i != res.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}