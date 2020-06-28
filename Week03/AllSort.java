package week03;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.HashSet;


/**
 * 全排列
 */
public class AllSort {


    public static void main(String[] args) {
        List<List<Integer>> res = permute(new int[] {1, 2});
        System.out.println(res);
    }


    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;

        List<List<Integer>> res = new ArrayList<>(factorial(len));
        if (len == 0) {
            return res;
        }

        HashSet<Integer> used = new HashSet<>(len);
        Deque<Integer> path = new ArrayDeque<>(len);

        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, Deque<Integer> path, HashSet<Integer> used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used.contains(i)) {
                used.add(i);
                path.addLast(nums[i]);

                dfs(nums, len, depth + 1, path, used, res);

                path.removeLast();
                used.remove(i);
            }
        }
    }

}
