class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        
        int l=Arrays.stream(arr).max().getAsInt();
        int h=Arrays.stream(arr).sum();
        if(k>arr.length){
            return -1;
        }int res=-1;
        while(l<=h){
         int mid=l+(h-l)/2;
        if(check(arr,mid,k)){
            res=mid;
            h=mid-1;
        }else{
            l=mid+1;
        }
        }return res;
        
        
    } static boolean check(int[] arr,int mid,int k){
        int c=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                c++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }return (c<=k);
    }
}
