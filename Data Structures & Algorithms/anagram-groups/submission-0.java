class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     HashMap<String,List<String>> grpAnag = new HashMap<>();

        for(String s : strs){
            char[] ss = s.toCharArray();

            Arrays.sort(ss);

            String sortedss = new String(ss);

            if(!grpAnag.containsKey(sortedss)){
                grpAnag.put(sortedss,new ArrayList<String>());

            }

            grpAnag.get(sortedss).add(s);
        }

        return new ArrayList<>(grpAnag.values());
        
    }
}
