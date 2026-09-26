class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;

        int count = 0;
        
        int[] selfNums = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            
            if(nums[i]==0){
                count++;
            }

            if(count>1){
                return new int[nums.length];
            }

            if(nums[i]!=0)
            product = product * nums[i];
        }

        for(int i = 0;i<nums.length;i++){

            if(count == 1){

                if(nums[i] == 0)
                selfNums[i] = product ;

                else{
                    selfNums[i] = 0;
                }

            }

            else{
            selfNums[i] = product/nums[i];
            }
        }


        return selfNums;
    }

    
}  
