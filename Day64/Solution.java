class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int zero=0,idx=0,prod=1;
        int arr1[]=new int[n];
        Arrays.fill(arr1,0);
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                idx=i;
            }else{
                prod*=arr[i];
            }
        }if(zero==0){
            for(int i=0;i<n;i++){
                arr1[i]=prod/arr[i];
            }
        }if(zero==1){
            arr1[idx]=prod;
        }return arr1;
    }
}
