class Solution {
    public static int minChar(String s) {
        // Write your code here
        int k=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        s=s+"$"+rev;
        int[] lps=computeLps(s);
        return k-lps[lps.length-1];
    }
    static int[] computeLps(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int i=1;
        int len=0;
        lps[0]=0;
        while(i<n){
            if(s.charAt(len)==s.charAt(i)){
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
