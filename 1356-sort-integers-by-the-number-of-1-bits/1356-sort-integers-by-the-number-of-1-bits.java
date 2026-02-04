class Solution {
    public int[] sortByBits(int[] arr) {
        Integer temp[] = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }

        Arrays.sort(temp, (a, b)->{
            int a_bit_1_count = Integer.bitCount(a);
            int b_bit_1_count = Integer.bitCount(b);
            int c = (a_bit_1_count-b_bit_1_count);
            return ((c==0)?(a-b):c);
        });
        for(int i=0; i<arr.length; i++){
            arr[i]=temp[i];
        }
        return arr;
    }
}