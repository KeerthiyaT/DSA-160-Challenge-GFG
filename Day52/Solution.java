class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int n=arr.length;
        int i=0,j=n-1,c=0;
        Arrays.sort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target){
                c+=j-i;
                i++;
            }else{
                j--;
            }
        }return c;
    }
}
