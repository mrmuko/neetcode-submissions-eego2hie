class Solution {
    public int longestConsecutive(int[] nums) {

      int length = nums.length;
      if(length <1)
      {
        return 0;
      }

      int current = 1;
      int res =1;
      Arrays.sort(nums);

      for(int i=1;i<nums.length;i++){
        if(nums[i] == nums[i-1]){
          continue;
        }

        if(nums[i] == nums[i-1] +1){
          current++;
        }else{
          current = 1;
        }

        res = Math.max(res,current);
        

      }

    return res;

        
        
    }
}
