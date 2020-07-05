package week04;


import java.util.Arrays;

/**
 * 分发饼干
 */
public class DistributeBiscuits {

    public static void main(String[] args) {
        int res = findContentChildren(new int[]{1,2,3}, new int[]{1,1});
        System.out.println(res);
    }

    private static int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }


}
