class Solution {
    public int[][] merge(int[][] intervals) {

         // If there are 0 or 1 intervals, nothing to merge
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on their starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Create a list to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] current = intervals[0];

        // Check the remaining intervals one by one
        for (int i = 1; i < intervals.length; i++) {

            // Take the next interval
            int[] next = intervals[i];

            // Check if the current and next intervals overlap
            if (next[0] <= current[1]) {

                // Merge them by taking the bigger ending value
                current[1] = Math.max(current[1], next[1]);

            } else {

                // No overlap, so save the current interval
                result.add(current);

                // Start working with the next interval
                current = next;
                    }
        }

        // Add the last interval to the result
        result.add(current);

        // Convert the list into a 2D array and return it
        return result.toArray(new int[result.size()][]);
        
    }
}