package week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 组合
 */
public class Combine {

    private static List<List<Integer>> result = new ArrayList<>();


    public static void main(String[] args) {
        List<List<Integer>> res = combine(4, 2);
        System.out.println(res);
    }

    public static List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || n < k) {
            return result;
        }
        findCombinations(n, k, 1, new Stack<>());
        return result;
    }

    private static void findCombinations(int n, int k, int index, Stack<Integer> p) {
        if (p.size() == k) {
            result.add(new ArrayList<>(p));
            return;
        }

        for (int i = index; i <= n - (k - p.size()) + 1; i++) {
            p.push(i);
            findCombinations(n, k, i + 1, p);
            p.pop();
        }
    }

}
