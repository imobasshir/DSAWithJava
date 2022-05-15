package com.mobasshir.heap;

import java.util.PriorityQueue;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 4;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            heap.add(nums[i]);
            // if heap size is greater than k then remove topmost priority element
            if(heap.size() > k) {
                heap.poll();
            }
        }
        // and in last when there is k element left in heap return min element in heap
        // which will be kth largest element
        int ans = heap.peek();
        System.out.println(ans);
    }
}
