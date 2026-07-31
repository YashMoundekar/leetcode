class Solution {
    public String toHex(int num) {

        //return Integer.toHexString(num);

        if (num == 0) {
            return "0";
        }

        char hex[] = {
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };

        StringBuilder ans = new StringBuilder();

        while (num != 0) {

            int rem = num & 15;  

            ans.append(hex[rem]);

            num = num >>> 4;     
        }

        return ans.reverse().toString();
       // return Integer.toHexString( num);


        
    }
}