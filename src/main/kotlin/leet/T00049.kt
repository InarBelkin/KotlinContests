package com.inar.leet

object T00049 {
    class Solution {
        fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val g = strs.groupBy { it.asSequence().sorted().joinToString() }.map { it.value }
            return g;
        }
    }
}