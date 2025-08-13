class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int res=0;
        int r=0,l=0;
        boolean a[]=new boolean[26];
        if(s.length()==0||s.length()==1){
                return s.length();
        }
        while(r<s.length()){
             while(a[s.charAt(r)-'a']==true){
                 a[s.charAt(l)-'a']=false;
                 l++;
             }
             a[s.charAt(r)-'a']=true;
             res=Math.max(res,r-l+1);
             r++;
        }return res;
        
    }
}
