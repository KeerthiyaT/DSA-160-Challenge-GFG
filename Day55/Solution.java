class Solution {
    public int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int c=0;
        for(int i=n-1;i>=2;i--){
           int j=0,k=i-1;
           while(j<k){
           if(arr[j]+arr[k]>arr[i]){
               c+=k-j;
               k--;
           }else{
               j++;
           }
           }
        }return c;
    }
}
