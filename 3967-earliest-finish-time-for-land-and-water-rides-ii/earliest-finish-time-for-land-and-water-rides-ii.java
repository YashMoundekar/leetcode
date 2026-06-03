class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int land=Integer.MAX_VALUE;
        int water=Integer.MAX_VALUE;

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            land=Math.min(land,landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<waterStartTime.length;i++){
            int curr=Math.max(land,waterStartTime[i])+waterDuration[i];
            ans=Math.min(ans,curr);
        }
        for(int i=0;i<waterStartTime.length;i++){
            water=Math.min(water,waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0;i<landStartTime.length;i++){
            int curr=Math.max(water,landStartTime[i])+landDuration[i];
            ans=Math.min(ans,curr);
        }
        return ans;
    }
}