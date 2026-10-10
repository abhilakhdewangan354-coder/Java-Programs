class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        first = l;

        l = 0;
        r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] <= target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        last = r;

        if (first >= nums.length || nums[first] != target)
            return new int[]{-1, -1};

        return new int[]{first, last};
    }
}
