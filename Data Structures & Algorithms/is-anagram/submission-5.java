class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length()!=t.length())
    return false;

    HashMap<Character,Integer> anaS = new HashMap<>();
    HashMap<Character,Integer> anaT = new HashMap<>();

    for(int i= 0 ;i<s.length();i++)
    {

    anaS.put(s.charAt(i),anaS.getOrDefault(s.charAt(i),0)+1);
    anaT.put(t.charAt(i),anaT.getOrDefault(t.charAt(i),0)+1);

    }

    // for(int i= 0 ;i<s.length();i++)
    // {
    //     if(!anaS.get(s.charAt(i)).equals(anaT.get(s.charAt(i))))
    //     return false;

    // }

    return anaS.equals(anaT);




    }
}
