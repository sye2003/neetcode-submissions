class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indices = new HashMap<>();
        int[] index = new int[2];

        for(int i = 0 ;i<nums.length;i++){
            int diff = target - nums[i];
            if(indices.containsKey(diff)){
                index[0] = indices.get(diff);
                index[1] = i;
                return index;
            }
            indices.put(nums[i],i);
        }

         return index;
        
    }
}
