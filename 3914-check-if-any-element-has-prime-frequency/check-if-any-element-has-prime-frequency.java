class Solution {
    public boolean checkPrimeFrequency(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i: map.values()){

            if(isPrime(i)){
                return true;
            }
            
        }
        return false;
    }

    boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}