package week04;

/**
 * 寻找旋转排序数组中的最小值
 */
public class FindMinFromRotateSortedArray {

    public static void main(String[] args) {
        int res = findMin(new int[]{4,5,6,7,0,1,2});
        System.out.println(res);
    }

    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }
        return nums[left];
    }


}
