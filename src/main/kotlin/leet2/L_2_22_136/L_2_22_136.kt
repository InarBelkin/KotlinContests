package com.inar.leet2.L_2_22_136

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val result = nums.fold(0) { acc, i -> acc xor i }
        return result
    }
}