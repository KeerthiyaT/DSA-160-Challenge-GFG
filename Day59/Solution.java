class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int lmax=arr[0];
        int rmax=arr[n-1];
        int res=0;
        int left=1,right=n-2;
        while(left<=right){
            if(lmax<rmax){
                res+=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left++;
            }
            else{
                res+=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right--;
            }
        }return res;
    }
}
