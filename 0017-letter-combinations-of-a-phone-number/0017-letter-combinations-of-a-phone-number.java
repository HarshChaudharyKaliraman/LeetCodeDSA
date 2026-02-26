class Solution 
{
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) 
    {
     Map<Character, String> map = new HashMap<>();
     map.put('2', "abc");
     map.put('3', "def");
     map.put('4', "ghi");
     map.put('5', "jkl");
     map.put('6', "mno");
     map.put('7', "pqrs");
     map.put('8', "tuv");
     map.put('9', "wxyz");

     solve(map, digits, 0, new StringBuilder());  
     return ans; 
    }
    void solve(Map<Character, String> map, String digits, int id, StringBuilder sb)
    {
        //base condition
         if(id == digits.length())
           {
            ans.add(sb.toString());
            return;
           }          
        //get the charcters from the digit
          String code = map.get(digits.charAt(id));
        //explore all characters of the digit
        for(char c: code.toCharArray())
        {
            sb.append(c);
             solve(map, digits, id+1, sb);
             sb.deleteCharAt(sb.length()-1); 
        }
            
    }
}