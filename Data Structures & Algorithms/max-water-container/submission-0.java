class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int width;
        int height;
        int  area = 0;

        while(left<right){
            width = right - left;
            height = Math.min(heights[left],heights[right]);
            area = Math.max(area,width*height);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }


        }

        return area;
    }
}
