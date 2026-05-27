class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> hp=new HashMap<>();
        String str[]=s.split(" ");

        if(pattern.length() != str.length) {
            return false;
        }

        

        for(int i=0;i<pattern.length();i++){

            char ch=pattern.charAt(i);


            if(hp.containsKey(ch)){
                if(!hp.get(ch).equals(str[i])){
                    return false;
                }
            }else{
                if(hp.containsValue(str[i])){
                    return false;
                }
            }
            hp.put(ch,str[i]);
        }

       return true;
        
    }
}