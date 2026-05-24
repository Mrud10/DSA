class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int [] left = new int[n];
        int [] right = new int[n];
            left[0] = 0;
            right[right.length-1] = 0;
            for(int i=1;i<n;i++){
                left[i] = Math.max(left[i-1],nums[i-1]);
            }  
            for(int i =right.length-2;i>=0;i--){
                right[i]=Math.max(right[i+1],nums[i+1]);
            } 
            int total = 0;
            for(int i=0;i<nums.length;i++){
                total += Math.max(0,Math.min(left[i],right[i])- nums[i]);
            }
            return total;
    }
} 
