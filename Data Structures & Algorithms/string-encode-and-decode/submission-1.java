class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }


        return sb.toString();

    }

    public List<String> decode(String str) {

        int i = 0;
        int j = 0;

        List<String> myList = new ArrayList<>();

        while(i<str.length()){

            j = i;


            while(str.charAt(j)!='#'){
                j++;
            }


            int length = Integer.parseInt(str.substring(i,j));

            myList.add(str.substring(j+1,j+1+length));

            i = j+1+length;

            j = i;




        }
        
        return myList;

    }
}
