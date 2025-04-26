class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int max=arr[0];
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            
             int temp=Math.max(arr[i],Math.max(min*arr[i],max*arr[i]));
             min=Math.min(arr[i],Math.min(min*arr[i],max*arr[i]));
             max=temp;
             res=Math.max(res,max);
        }
        return res;
        
    }
}
