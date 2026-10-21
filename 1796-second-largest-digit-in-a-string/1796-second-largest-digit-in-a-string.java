class Solution {
    public int secondHighest(String s) {
        ArrayList<Character> arr = new ArrayList<Character>();
        int max=-1;
        int max2=-1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                arr.add(s.charAt(i));
            }
        }
        for(int i=0; i<arr.size(); i++){
            if(max<(arr.get(i)-'0')){
                max2=max;
                max=arr.get(i)-'0';
            }else if(max2<(arr.get(i)-'0') && max>(arr.get(i)-'0')){
                max2=arr.get(i)-'0';
            }
        }
        return max2;
    }
}