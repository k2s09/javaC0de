import java.util.Arrays;
class Solution {
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		int n = intervals.length;
		int[][] res = new int[n][2];
		int idx = -1;
		for (int[] interval : intervals) {
			if (idx == -1 || interval[0] > res[idx][1]) {
				res[++idx] = interval;
			} else {
				res[idx][1] = Math.max(res[idx][1], interval[1]);
			}
		}
		return Arrays.copyOf(res, idx + 1);
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		int[][] res = sol.merge(intervals);
		for (int[] interval : res) {
			System.out.println(Arrays.toString(interval));
		}
	}
}
