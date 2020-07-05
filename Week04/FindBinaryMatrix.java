package week04;

/**
 * 搜索二维矩阵
 */
public class FindBinaryMatrix {

    public static void main(String[] args) {
        boolean res = searchMatrix(new int[][]{
                    new int[]{1, 3, 5, 7},
                    new int[]{10, 11, 16, 20},
                    new int[]{23, 30, 34, 50}
                }, 0);
        System.out.println(res);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;

        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col])
                return true;
            else if (target > matrix[row][col])
                row++;
            else
                col--;
        }
        return false;
    }

}
