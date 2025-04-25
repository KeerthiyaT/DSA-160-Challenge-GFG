class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
