class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
        boolean[] remove = new boolean[intervals.length];
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){

                if(i==j){
                    continue;
                }
                if (intervals[j][0] <= intervals[i][0]
                        && intervals[i][1] <= intervals[j][1]) {
                    remove[i] = true;
                    break;
                }
            }
        }
        for (boolean b : remove) {
            if (b)
                count++;
        }

        return intervals.length-count;
    }
}