class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> unique = new HashSet<>();

        int left = 0;
        int right = 0;

        int max = 0;

        for(right = 0; right<s.length();right++){

            while(unique.contains(s.charAt(right))){

                unique.remove(s.charAt(left));
                left++;

            }

            unique.add(s.charAt(right));

            max = Math.max(max,right-left+1);
       
        }

        return max;
        
    }
}
