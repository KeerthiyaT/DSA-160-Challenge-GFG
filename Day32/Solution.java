class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1=a.length;
        int n2=b.length;
        int c[]=new int[n1+n2];
        int j=0;
        for(int i=0;i<n1;i++){
            c[j++]=a[i];
        }for(int i=0;i<n2;i++ ){
            c[j++]=b[i];
        }Arrays.sort(c);
        return c[k-1];
    }
}
