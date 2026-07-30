class Solution {
    public int minimumPushes(String word) {
      int num=word.length()>>3;
      int num2=word.length()&7;
      return((num<<2)+num2)*(num+1);

    }
}