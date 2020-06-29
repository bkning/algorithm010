package week02;

import java.util.*;

/**
 * 前K个高频元素
 */
public class TopKFrequent {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,2,3,3,5,6,7,8,8,9};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result);
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer>[] list = new List[nums.length+1];
        for(int key : map.keySet()){
            int i = map.get(key);
            if(list[i] == null){
                list[i] = new ArrayList<>();
            }
            list[i].add(key);
        }

        for(int i = list.length - 1;i >= 0 && res.size() < k;i--){
            if(list[i] == null) continue;
            res.addAll(list[i]);
        }
        return res;
    }

}