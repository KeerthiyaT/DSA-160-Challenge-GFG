class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        int l=0,r=n-1;
        int res=0;
        while(l<r){
           int amount=Math.min(arr[l],arr[r])*(r-l);
           res=Math.max(res,amount);
           if(arr[l]<arr[r]){
               l++;
           }else{
               r--;
           }
        }return res;
    }
}
