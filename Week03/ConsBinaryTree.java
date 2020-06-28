package week03;


import java.util.HashMap;

/**
 * 从前序与中序遍历序列构造二叉树
 */
public class ConsBinaryTree {

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        return buildTreeHelper(preOrder, 0, preOrder.length, inOrder, 0, inOrder.length, map);
    }

    private TreeNode buildTreeHelper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if (preStart == preEnd) {
            return null;
        }

        int rootVal = preOrder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int inRootIndex = map.get(rootVal);
        int leftNum = inRootIndex - inStart;
        root.left = buildTreeHelper(preOrder, preStart + 1, preStart + leftNum + 1, inOrder, inStart, inRootIndex, map);
        root.right = buildTreeHelper(preOrder, preStart + leftNum + 1, preEnd, inOrder, inRootIndex + 1, inEnd, map);
        return root;
    }

}
