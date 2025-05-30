class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < n; i++) {
            int[] last = res.get(res.size() - 1);
            int[] cur = arr[i];

            if (cur[0] <= last[1]) {
                last[1] = Math.max(cur[1], last[1]);
            } else {
                res.add(new int[]{cur[0], cur[1]});
            }
        }
        return res;
    }
}
