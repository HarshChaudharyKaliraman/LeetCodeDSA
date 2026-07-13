class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('0', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        solve(ans, map, digits, 0, new StringBuilder());
        return ans;
    }
    void solve(List<String> ans, HashMap<Character, String> map, String digits, int start, StringBuilder temp){
        if(start==digits.length()){
            ans.add(temp.toString());
            return;
        }
        String co = map.get(digits.charAt(start));
        for( char c : co.toCharArray()){
            temp.append(c);
            solve(ans, map, digits, start+1, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}