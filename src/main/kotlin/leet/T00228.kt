package com.inar.leet

class T00228 {
    class Solution {
        fun summaryRanges(nums: IntArray): List<String> {
            if(nums.size == 0) return listOf<String>();
            var curStart = nums.first();
            var curEnd = nums.first();
            val result = mutableListOf<String>();
            for(num in nums.asSequence().drop(1)){
                if(num == curEnd +1){
                    curEnd = num;
                }
                else{
                    if(curStart == curEnd){
                        result.add(curStart.toString())
                    }
                    else{
                        result.add("$curStart->$curEnd")
                    }
                    curStart = num;
                    curEnd = num;
                }
            }
            if(curStart == curEnd){
                result.add(curStart.toString())
            }
            else{
                result.add("$curStart->$curEnd")
            }
            return result;
        }
    }
}