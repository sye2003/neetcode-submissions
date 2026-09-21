class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] temp = new int[temperatures.length];

        

        for(int i= 0 ;i<temperatures.length;i++){
            int count = 0;
            for(int j = i+1;j<temperatures.length;j++){

                if(temperatures[i]<temperatures[j]){
                    count++;
                    temp[i] = count;
                    count = 0;
                    break;
                }
                count++;

            }
        }

        return temp;
        
    }
}
