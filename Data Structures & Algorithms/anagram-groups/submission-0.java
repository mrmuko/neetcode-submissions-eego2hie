class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HashMap<>();
        //eat, ate

        for(String s : strs){
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray); //1-a,e,t //2-a,e,t

            String sortedS = new String(charArray); //1-aet //2-aet

            res.putIfAbsent(sortedS, new ArrayList<>()); //{"aet":[]}

            res.get(sortedS).add(s); //1- [eat] //2- [eat,ate]

           


        }
         return new ArrayList<>(res.values()); //[[eat,ate]]
        
}
}