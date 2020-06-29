package week02;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的前序遍历
 */
public class NTreePreIteration {

    public static List<Integer> list = new ArrayList<>();

    public static List<Integer> preorder(TreeNode root) {
        if (root == null) {
            return list;
        }

        list.add(root.val);
        for(TreeNode node : root.children) {
            preorder(node);
        }

        return list;
    }

}
