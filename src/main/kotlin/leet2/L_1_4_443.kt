package com.inar.leet2

fun main() {
    Solution().compress(charArrayOf())
}

class Solution {
    fun compress(chars: CharArray): Int {
        var writePos = 0

        var currentChar = chars[0]
        var currentCharCount = 1;

        fun addCurrentCharToResult() {
            if (currentCharCount == 1) {
                chars[writePos] = currentChar;
                writePos++;
            } else {
                chars[writePos] = currentChar;
                writePos++;
                val charCountString = currentCharCount.toString()
                for (j in charCountString) {
                    chars[writePos] = j;
                    writePos++;
                }
            }
        }

        for (i in 1..<chars.size) {
            if (chars[i] == currentChar) {
                currentCharCount++;
            } else {
                addCurrentCharToResult()
                currentChar = chars[i];
                currentCharCount = 1;
            }
        }

        addCurrentCharToResult();

        return writePos;
    }
}
// abb
// a
// writePos = 1
// curChar = b
