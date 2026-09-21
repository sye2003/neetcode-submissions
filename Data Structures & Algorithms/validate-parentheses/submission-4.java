class Solution {
    public boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();

        for(char bracket : s.toCharArray()){

            if(bracket == '(')
              brackets.push(')');
           else if(bracket == '{')
              brackets.push('}');
           else if(bracket == '[')
              brackets.push(']');
            else{
                if(brackets.isEmpty() || bracket != brackets.pop()){
                    return false;
                }
            }
        }

        return brackets.isEmpty();
        
    }
}
