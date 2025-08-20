class Solution {
    public List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (sum == 0) {
                    result.add(new int[]{start, end});
                }
            }
        }

        return result;
    }
}
