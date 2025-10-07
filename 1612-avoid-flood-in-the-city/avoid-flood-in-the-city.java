import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> lakeToDay = new HashMap<>(); // last day it rained on this lake
        TreeSet<Integer> dryDays = new TreeSet<>(); // days we can dry a lake

        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake == 0) {
                dryDays.add(i);
                ans[i] = 1; // default value, can dry any lake
            } else {
                if (lakeToDay.containsKey(lake)) {
                    Integer dryDay = dryDays.ceiling(lakeToDay.get(lake));
                    if (dryDay == null) return new int[0]; // flood cannot be avoided
                    ans[dryDay] = lake; // dry this lake on that day
                    dryDays.remove(dryDay);
                }
                lakeToDay.put(lake, i);
                ans[i] = -1; // it rained on this day
            }
        }

        return ans;
    }
}
