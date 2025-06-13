// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int l=1;
        int res=0;
        int n=stalls.length;
        int h=stalls[n-1]-stalls[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(stalls,k,mid)){
                res=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }return res;
        
    }static boolean check(int[] stalls,int k,int mid){
        int prev=stalls[0];
        int n=stalls.length;
        int c=1;
        for(int i=1;i<n;i++){
            if(stalls[i]-prev>=mid){
                prev=stalls[i];
                c++;
            }
        }return (c>=k);
    }
}
