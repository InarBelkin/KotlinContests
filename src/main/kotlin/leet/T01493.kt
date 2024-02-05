package com.inar.leet

class T01493 {
    class Solution {
        fun longestSubarray(nums: IntArray): Int {
            var result = 0;
            var cntOfZeroes = 0;
            var cntOfOnes = 0;
            var right = 0;
            for(left in 0..<nums.size){
                while(right<nums.size && (cntOfZeroes == 0 || (nums[right] == 1))){
                    if(nums[right] == 1)
                        cntOfOnes++;
                    else
                        cntOfZeroes++;
                    right++;
                }

                val curCountAfterDeleting = if(cntOfZeroes == 1) cntOfOnes else cntOfOnes-1
                result = Math.max(result,curCountAfterDeleting)

                if(nums[left] == 1)
                    cntOfOnes--;
                else
                    cntOfZeroes--;
            }

            return result;
        }
    }
}