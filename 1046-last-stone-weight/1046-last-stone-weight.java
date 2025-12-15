import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> b - a);

        // Insert all stones → O(n log n)
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }

        // Each smash → log n
        while (pq.size() > 1) {
            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            if (y != x) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
