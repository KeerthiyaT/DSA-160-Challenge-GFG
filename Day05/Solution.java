class Solution {
    public void nextPermutation(int[] arr) {
        // code here
        int pivot=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            } 
        }
    
        if(pivot==-1){
            reverse(arr,pivot);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        reverse(arr,pivot);
    }
        
       void reverse(int[] arr,int pivot){
        int s=pivot+1,e=arr.length-1;
       
            while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
       }
}
