class ValidParenthesis {
    public boolean isValid(String s) {
      HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack <Character> stack = new Stack<Character>();
        
        for(char i : s.toCharArray())
        {
            if(map.containsKey(i))
            {
                stack.push(map.get(i));
            }
            else if(stack.isEmpty()|| stack.pop()!= i)
                    return false;
        }
        return stack.isEmpty();
    }   
}
    