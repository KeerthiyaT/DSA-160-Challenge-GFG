class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String txt=s1+s1;
        int n=txt.length();
        int m=s2.length();
        int[] lps=computeLps(s2);
        int i=0,j=0;
        while(i<n){
            if(txt.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return true;
            }
            else if(i<n && txt.charAt(i)!=s2.charAt(j)){
                if(j!=0)
                j=lps[j-1];
                else
                i++;
            }
        }
        return false;
    }
    static int[] computeLps(String s2){
        int n=s2.length();
        int[] lps=new int[n];
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<n){
            if(s2.charAt(len)==s2.charAt(i)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
