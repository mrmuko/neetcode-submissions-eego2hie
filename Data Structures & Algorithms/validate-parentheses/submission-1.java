class Solution {
    public boolean isValid(String s) {

      Stack<Character> stack = new Stack<>();
      Map<Character, Character> symbolDict = new HashMap<>();
        symbolDict.put(')','(');
        symbolDict.put('}','{');
        symbolDict.put(']','[');

      

      for(char c:s.toCharArray()){
        if(symbolDict.containsKey(c)){
            if(!stack.isEmpty()&& stack.peek() == symbolDict.get(c)){
                stack.pop();
            }else{
                return false;
            }

        }else{
            stack.push(c);
        }
      }
      return stack.isEmpty();
    }
}
