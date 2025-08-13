class GfG {

    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
          
            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {
              
                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
