class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> once = new HashSet<>();

        for(int i : nums){
            if(once.contains(i)){
                return true;
            }

            once.add(i);
        }

        return false;
 
    }
}