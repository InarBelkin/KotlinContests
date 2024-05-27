package com.inar.leet

object T00438 {

    class Solution {
        fun findAnagrams(s: String, p: String): List<Int> {
            if (p.length > s.length) {
                return listOf();
            }
            val originalCounts = mutableMapOf<Char, Int>();
            for (c in p) {
                originalCounts[c] = originalCounts.getOrDefault(c, 0) + 1
            }

            val curCounts = mutableMapOf<Char, Int>();
            for (i in 0..<p.length) {
                curCounts[s[i]] = curCounts.getOrDefault(s[i], 0) + 1
            }

            var curCntOfMatches = 0;
            for (key in originalCounts.keys) {
                if (key in curCounts && curCounts[key] == originalCounts[key]) {
                    curCntOfMatches++;
                }
            }
            var answer = mutableListOf<Int>();
            if (curCntOfMatches == originalCounts.size) {
                answer.add(0)
            }

            var left = 0;
            while (left + p.length < s.length) {
                if (s[left] in originalCounts) {
                    if (curCounts[s[left]] == originalCounts[s[left]]) {
                        curCntOfMatches--;
                    }
                    curCounts[s[left]] = curCounts[s[left]]!!-1;
                    if (curCounts[s[left]] == originalCounts[s[left]]) {
                        curCntOfMatches++;
                    }
                }
                val right = left + p.length;

                if (s[right] in originalCounts) {
                    if (s[right] !in curCounts) {
                        curCounts[s[right]] = 0;
                    }
                    if (curCounts[s[right]] == originalCounts[s[right]]) {
                        curCntOfMatches--;
                    }
                    curCounts[s[right]] = curCounts[s[right]]!! + 1;
                    if (curCounts[s[right]] == originalCounts[s[right]]) {
                        curCntOfMatches++;
                    }
                }

                if (curCntOfMatches == originalCounts.size) {
                    answer.add(left+1)
                }
                left++;
            }
            return answer;
        }
    }
}