class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1){

            return nums;
        }
        
        int sum=0;
        int arr[]=new int[nums.length-k+1];
        Deque<Integer> dq = new LinkedList<>();
        int m=0;
        for(int i=0;i<nums.length;i++){

               while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Store answer when first window is complete
            if (i >= k - 1) {
                arr[m++] = nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}