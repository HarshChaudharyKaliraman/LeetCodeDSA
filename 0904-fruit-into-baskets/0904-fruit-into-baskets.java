class Solution {
    public int totalFruit(int[] fruits) {
        int l=0, r=0;
        Map<Integer, Integer> mp = new HashMap<>();
        int ans=0;
        while(r<fruits.length){
            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0)+1);
            while(mp.size()>2){
                mp.put(fruits[l], mp.get(fruits[l])-1);
                if(mp.get(fruits[l])==0){
                   mp.remove(fruits[l]); 
                }
                l++;
            }
            ans=Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}