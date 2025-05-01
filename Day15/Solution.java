class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        
        while(i>=0 || j>=0 || carry!=0){
            int a=(i>=0)? s1.charAt(i)-'0':0;
            int b=(j>=0)? s2.charAt(j)-'0':0;
            int sum=a+b+carry;
            str.append(sum%2);
            carry=(sum/2);
            i--;
            j--;
        }
        String s=str.reverse().toString();
        int k=0;
        while(k<s.length() && s.charAt(k)=='0'){
            k++;
        }
        return (s.length())==k ?"0":s.substring(k);
        
    }
}
