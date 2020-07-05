package week04;

/**
 * 跳跃游戏
 */
public class JumpGame {

    public boolean canJump(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==0){
                if (passZero(nums, i))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    private static boolean passZero(int[] nums,int index){
        for (int i=index;i>=0;i--){
            if (nums[i]>(index-i))
                return true;
        }
        return false;
    }


}
