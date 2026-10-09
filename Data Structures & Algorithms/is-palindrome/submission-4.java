class Solution {
    public boolean isPalindrome(String s) {

        String ss = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){

            while(left<right && !Character.isLetterOrDigit(ss.charAt(left))){
                left++;
            }

             while(left<right && !Character.isLetterOrDigit(ss.charAt(right))){
                right--;
            }

            if(ss.charAt(left) != ss.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }
}
