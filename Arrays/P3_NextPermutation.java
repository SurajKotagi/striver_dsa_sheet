class Solution {
    public void nextPermutation(int[] nums) {
        // intuion :
        // to find next permutation , it means that after 1.5 -> 1.6

        // take example - 1 2 5 4 3 next permutation is - 1 3 2 4 5
        // step by step

        // here the next value is when I increase 2
        // I have to replace to by some greater value
        // I have to replace it with exact next greater element, so that it will lead to
        // next grater number as whole
        // it becomes - 1 3 5 4 2
        // any number with 1 3 as prefix is always greater than one with 1 2 as prefix
        // so
        // to get next smallest after prefix we should have 2 4 5
        // which can be formed by reversing right side elements of 3 as we know they are
        // in descending order , reversing them will make them smallest possible order

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[i] >= nums[j])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i) {
        int l = i;
        int r = nums.length - 1;
        while (l < r)
            swap(nums, l++, r--);
    }
}