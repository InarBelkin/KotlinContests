package com.inar.leet

object T00140 {
    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): List<String> {
            val wordSet = wordDict.toSet();
            val memo = mutableMapOf(s.length to listOf(listOf<String>()));
            fun dfs(startIndex: Int): List<List<String>> {
                if(startIndex in memo){
                    return memo[startIndex]!!;
                }
                val sentenceContinues = mutableListOf<List<String>>();
                for(endIndex in startIndex..<s.length){
                    val potentialWord = s.substring(startIndex..endIndex);
                    if(potentialWord in wordSet){
                        val continuesWithThisWord = dfs(endIndex+1).map {listOf(potentialWord)+it}
                        sentenceContinues.addAll(continuesWithThisWord)
                    }
                }
                memo[startIndex] = sentenceContinues
                return sentenceContinues;
            }

            val result = dfs(0);
            return result.map { it.joinToString(" ")}
        }
    }
}