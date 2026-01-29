class Solution {
    public boolean validMountainArray(int[] arr) {
        int count=1;
        if(arr.length<3){
            return false;
        }
        for(int i = 1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                return false;
            }
            if(arr[i]<arr[i-1]){
                break;
            }
            count++;
        }
        if(count==arr.length || count == 1){
            return false;
        }
        for(int i = count; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                return false;
            }
            if(arr[i]>arr[i-1]){
                return false;
            }
        }
        return true;
    }
}