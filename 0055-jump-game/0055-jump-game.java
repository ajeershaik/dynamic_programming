class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length == 1){
            return true;
        }
        int end = 0;
        for(int i=0;i<nums.length;i++){
            /*if(i <= end){
                end = Math.max(end,nums[i]+i);
                if(end+1 >= nums.length){
                    return true;
                }
            }*/
            if(i>end){
                return false;
            }
            end = Math.max(end,nums[i]+i);
        }
        return true;
    }
}