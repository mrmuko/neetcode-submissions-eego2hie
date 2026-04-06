class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i=0; i< nums.length; i++){
            int checkThisNum = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(checkThisNum == nums[j]){
                    return true;
                }
            }
        }

        return false;
 
    }
}
