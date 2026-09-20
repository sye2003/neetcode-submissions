// class Solution {
//     public boolean isValid(String s) {

//         Stack<Character> stack = new Stack<>();

//         char[]  string = s.toCharArray();

//         for(char ss : string){

//             if(ss == ')' || ss == '}' || ss==']' ){
               
//               char top =  stack.pop();



//             }

//             stack.push(ss);
//         }
        
//     }
// }

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}