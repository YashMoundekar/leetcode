class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length/3;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                li.add(entry.getKey());
            }
        }
        return li;
    }
}