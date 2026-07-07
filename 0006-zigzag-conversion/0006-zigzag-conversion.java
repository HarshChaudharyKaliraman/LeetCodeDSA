class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder []rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i]=new StringBuilder();
        }
        int curr=0;
        int direc=0;
        for(int i=0; i<s.length(); i++){
            rows[curr].append(s.charAt(i));
            if(curr==0){
                direc=0;
            }else if(curr==numRows-1){
                direc=1;
            }
            if(direc==0){
                curr++;
            }else if(direc==1){
                curr--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder row:rows){
            ans.append(row);
        }
        return ans.toString();
    }
}