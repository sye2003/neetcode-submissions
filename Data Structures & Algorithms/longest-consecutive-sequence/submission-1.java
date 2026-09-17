class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            numbers.add(nums[i]);
        }

        int count = 0;
        int maxCount = 0;

        for(int i = 0;i<nums.length;i++){
            
            int pointer = nums[i];

            if(!numbers.contains(pointer-1)){

                while(numbers.contains(pointer)){
                count++;

                maxCount = Math.max(maxCount,count);
                pointer++;

                }

                count = 0;
            }
          
        }

        return maxCount;
        
    }
}
