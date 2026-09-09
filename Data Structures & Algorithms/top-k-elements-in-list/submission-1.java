class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        } 

        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int i = 0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int n : freq.keySet()){

            int frequency = freq.get(n);

            buckets[frequency].add(n);

        }

        int[] topKFreq = new int[k];
        int index = 0;

        for(int i = buckets.length-1;i>=0 && index < k;i--){
            
            for(int n : buckets[i]){
                topKFreq[index] = n;
                index++;

                if(index == k){
                    break;
                }
            }
        }

        return topKFreq;


        
    }
}
