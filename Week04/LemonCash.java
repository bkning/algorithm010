package week04;


/**
 * 柠檬水找零
 */
public class LemonCash {

    public static void main(String[] args) {
        boolean res = greedySolution(new int[]{5,5,5,10,20});
        System.out.println(res);
    }

    private static boolean greedySolution(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5: five++; break;
                case 10: five--; ten++; break;
                case 20: {
                    if (ten > 0) {
                        ten--; five--;
                    } else {
                        five -= 3;
                    }
                    break;
                }
                default: break;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }


}
