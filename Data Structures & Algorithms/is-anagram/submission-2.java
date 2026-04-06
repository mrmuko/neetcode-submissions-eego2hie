class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        char[] n = s.toCharArray();
        char[] m = t.toCharArray();

        Arrays.sort(n);
        Arrays.sort(m);

        return Arrays.equals(n,m);

        
    }
}
