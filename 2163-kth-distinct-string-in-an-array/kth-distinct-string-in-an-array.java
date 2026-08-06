class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> mp = new LinkedHashMap<>();;

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for (String key : mp.keySet()) {
            if (mp.get(key) == 1) {
                count++;
            }
            if(count==k){
                return key;

            }
            
        }
        return "";
    }
}