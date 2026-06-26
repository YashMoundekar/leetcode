class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            max=Math.max(max,map.get(sum));
        }
        int count=0;
        for(int i:map.values()){
            if(i==max){
                count++;
            }
        }
        return count;
    }
}