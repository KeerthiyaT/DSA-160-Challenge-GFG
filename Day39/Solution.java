class GfG {
    static boolean search(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            // If x == mid, return true
            if (x == arr[mid])
                return true;

            // If x < arr[mid], search in the left half
            if (x < arr[mid])
                hi = mid - 1;

            // If x > arr[mid], search in the right half
            else
                lo = mid + 1;
        }
        return false;
    }
