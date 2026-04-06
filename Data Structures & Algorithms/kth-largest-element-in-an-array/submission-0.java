class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int result =0;

        for(int i: nums){
            queue.add(i);

        }

        for(int i=0; i<k-1; i++){
            queue.poll();
            
            
        }
        result = queue.peek();

        return result;


        
    }
}
