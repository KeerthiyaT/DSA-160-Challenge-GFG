class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int n=intervals.length;
        int c=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int e=intervals[0][1];
        for(int i=1;i<n;i++){
            if(e>intervals[i][0]){
                c++;
                e=Math.min(intervals[i][1],e);
            }else{
                e=intervals[i][1];
            }
        }return c;
    }
}
