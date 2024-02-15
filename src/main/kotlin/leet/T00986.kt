package com.inar.leet

object T00986 {
    class Solution {
        fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
            val events = mutableListOf<Event>();
            for (interval in firstList + secondList) {
                events.add(Event(interval[0], start));
                events.add(Event(interval[1], end));
            }

            events.sortWith(compareBy({ it.index }, { it.type }))
            var result = mutableListOf<IntArray>();
            var countOpen = 0;
            var bothStarted: Int? = null;
            for (event in events) {
                if (event.type == start) {
                    countOpen++;
                    if (countOpen == 2) {
                        bothStarted = event.index;
                    }
                } else {
                    result.add(intArrayOf(bothStarted!!, event.index))
                    bothStarted = null;
                }
            }

            return result.toTypedArray()
        }

        data class Event(val index: Int, val type: Int)
        companion object {
            const val start: Int = 0;
            const val end: Int = 1;
        }
    }
}