class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 1;
        int right = 2;

        HashMap<Integer,Integer> sum = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            sum.put(numbers[i],i+1);
        }

        for(int i=0;i<numbers.length;i++){

            int value = target - numbers[i];

            if(sum.containsKey(value)){
                return new int[]{i+1,sum.get(value)};
            }

        }

        return new int[2];




       
        
    }
}
