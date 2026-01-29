class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for(int i : candies){
            int ch = 0;
            int j = i + extraCandies;
            for(int x = 0; x<candies.length; x++){
                if(candies[x]>j){
                    result.add(false);
                    ch = 1;
                    break;
                }
            }
            if(ch==0){
                result.add(true);
            }
        }
        return result;
    }
}