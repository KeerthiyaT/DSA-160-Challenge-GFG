class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int res=arr[n-1]-arr[0];
        for(int i=0;i<n-1;i++){
            
               int min=Math.min(arr[0]+k,arr[i+1]-k);
               int max=Math.max(arr[n-1]-k,arr[i]+k);
               if(min<0) continue;
               res=Math.min(res,max-min);
            
        }
        return res;
    }
}
