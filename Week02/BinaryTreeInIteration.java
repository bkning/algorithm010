package week02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class BinaryTreeInIteration {

    public List<Integer> inOrderIteration(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        Deque <TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;

        while (!stack.isEmpty() || p != null) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            TreeNode tmp = stack.pop();
            res.add(tmp.val);
            p = tmp.right;
        }
        return res;
    }

}
