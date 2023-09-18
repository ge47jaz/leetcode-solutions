/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;

        //construct hashmap
        for (int i = 0; i < n; i++){
            map.put(nums[i], i);
        }    
       
        //find complement
        for (int i = 0; i < n; i++){
            int comp = target - nums[i];
            if (map.containsKey(comp) && map.get(comp) != i){
                return new int[]{i, map.get(comp)};
            }
        }  
        
        //no result found
        return new int[]{};
    }

}
// @lc code=end

