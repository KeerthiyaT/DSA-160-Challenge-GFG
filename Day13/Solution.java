class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        
        
        Arrays.sort(arr);
        int x=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                x++;
            }
        }return x;
        
        
    }
}
