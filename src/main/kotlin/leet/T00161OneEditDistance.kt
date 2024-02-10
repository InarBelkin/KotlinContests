package com.inar.leet

object T00161OneEditDistance {
    class Solution() {
        fun isOneEditDistance(s: String, t: String): Boolean {
            var s1 = s;
            var s2 = t;
            if (s1.length > s2.length) {
                s1 = s2.also { s2 = s1 };
            }
            if (s2.length - s1.length > 1) {
                return false;
            }

            if (s1.length == s2.length) {
                var cntOfDifferentSyms = 0;
                for (i in s1.indices) {
                    if (s1[i] != s2[i]) {
                        cntOfDifferentSyms++;
                    }
                }

                return cntOfDifferentSyms == 1;
            }

            //s2.length = s1.length+1

            var p1 = 0;
            var p2 = 0;
            while (p1 < s1.length && p2 < s2.length) {
                if (s1[p1] == s2[p2]) {
                    p1++;
                    p2++;
                } else {
                    p2++;
                }
            }
            return p1 == s1.length && p2 == s2.length
        }
    }
}