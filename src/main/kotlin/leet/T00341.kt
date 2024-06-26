package com.inar.leet

object T00341 {

    interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        fun isInteger(): Boolean

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        fun getInteger(): Int?

        // Set this NestedInteger to hold a single integer.
        fun setInteger(value: Int): Unit

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        fun add(ni: NestedInteger): Unit

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        fun getList(): List<NestedInteger>?
    }

    class NestedIterator(nestedList: List<NestedInteger>) {
        private fun generateSequence(l:List<NestedInteger>): Sequence<Int>{
            return sequence{
                for(ni in l){
                    if(ni.isInteger()){
                        yield(ni.getInteger()!!);
                    }
                    else{
                        val nestedSequence = generateSequence(ni.getList()!!)
                        for(nni in nestedSequence){
                            yield(nni)
                        }
                    }
                }
            }
        }

        val fullIterator = generateSequence(nestedList).iterator();

        fun next(): Int {
            return fullIterator.next();
        }

        fun hasNext(): Boolean {
            return fullIterator.hasNext();
        }
    }
}