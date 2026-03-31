class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length*2);
        for(int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
}