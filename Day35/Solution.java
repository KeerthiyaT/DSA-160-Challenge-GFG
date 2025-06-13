class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int c=0;
        int j=1;
        int i=0;
        while(c<=k){
            if(i<arr.length && arr[i]==j){
                i++;
            }   
            else{
                c++;
                if(k==c) return j;
            }
            j++;
        }return -1;
    }
}
