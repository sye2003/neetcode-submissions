class Solution {
    public boolean isAnagram(String s, String t) {

        char[] left = s.toCharArray();
        char[] right = t.toCharArray();

        if(left.length!=right.length)
        return false;

        Arrays.sort(left);
        Arrays.sort(right);

        for(int i = 0 ; i< left.length;i++){
            if(left[i]!=right[i])
            return false;
        }

        return true;




    }
}
