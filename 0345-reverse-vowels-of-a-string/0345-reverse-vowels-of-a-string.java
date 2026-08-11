class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!isNotVowel(arr[l]) && !isNotVowel(arr[r])){
                l++;
                r--;
            }else{
                while(!isNotVowel(arr[l]) && l<r){
                    l++;
                }
                while(!isNotVowel(arr[r]) && r>l){
                    r--;
                }
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    public void swap(char arr[], int c, int d){
        char temp = arr[c];
        arr[c]=arr[d];
        arr[d]=temp;
    }
    public boolean isNotVowel(char c){
        return c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U';
    }
}