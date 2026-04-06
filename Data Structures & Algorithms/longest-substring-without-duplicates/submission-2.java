class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] word = s.toCharArray();
        int resLength = 0;
        int lastlength =0;
        

        for(int i=0; i<word.length; i++){
            Set<String> seen = new HashSet<>();
            String letter = String.valueOf(word[i]);
            seen.add(letter);
            int currentLength =1;
            for(int j=i+1; j<word.length; j++){
                String anotherLetter = String.valueOf(word[j]);
                
                if(!seen.contains(anotherLetter)){
                    seen.add(anotherLetter);
                    currentLength++;

                }else{
                    break;
                }
                

            }
            resLength = Math.max(currentLength, resLength);
        }
        return resLength;
        
        
    }
}
