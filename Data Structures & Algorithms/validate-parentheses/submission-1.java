class Solution {
    public boolean isValid(String s) {

        Stack<Character> backet = new Stack<>();

        HashMap<Character,Character> backets = new HashMap<>();

        backets.put('(',')');
        backets.put('{','}');
        backets.put('[',']');

        for(char ss : s.toCharArray()){

            if(ss ==')' || ss =='}' ||ss ==']'){

                if(backet.isEmpty()){
                    return false;
                }

                if(ss!=backets.get(backet.pop())){
                   return false;
                   }

            }

            else{

              backet.push(ss);
              }
        }
        
         return backet.isEmpty();
    }
}
