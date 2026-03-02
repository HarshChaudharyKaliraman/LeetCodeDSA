class Solution {
    public boolean checkZeroOnes(String s) {

        int max0 = 0;
        int count0 = 0;
        int max1 = 0;
        int count1 = 0;

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c == '1') {
                if (max0 < count0) {
                    max0 = count0;
                }
                count1++;
                count0 = 0;
            } else if (c == '0') {
                if (max1 < count1) {
                    max1 = count1;
                }
                count0++;
                count1 = 0;
            }
        }
        if (max0 < count0) {
            max0 = count0;
        }
        if (max1 < count1) {
            max1 = count1;
        }

        if (max1 > max0) {
            return true;
        }
        return false;
    }
}