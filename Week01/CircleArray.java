/**
 * 旋转数组
 */
public class CircleArray {

    public void rotate(int[] nums, int k) {
        int len  = nums.length;
        k = k % len;
        int count = 0; //交换位置次数
        for(int start = 0; count < len; start++) {
            int cur = start;
            int pre = nums[cur];
            do {
                int next = (cur + k) % len;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                cur = next;
                count++;
            } while (start != cur);
        }
    }

}
