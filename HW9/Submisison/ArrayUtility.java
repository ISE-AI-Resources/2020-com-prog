
import java.util.Arrays;

public class ArrayUtility {
	
	/**
	 * combines a given 2D array into 1D array
	 * for example,
	 * { {1, 2}, {3, 4, 5} } -> {1, 2, 3, 4, 5}
	 * @param d
	 * @return 1D array of combine all elements from 2D array
	 */
	public static int[] merge(int[][] d) {
		int cnt = 0;
		for(int i = 0; i < d.length; i++) {
			cnt += d[i].length;
		}
		int[] res = new int[cnt];
		cnt = 0;
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length ; j++) {
				res[cnt] = d[i][j];
				cnt++;
			}
		}
		return res;
	}
	
	/** 
	 * splits a given 1D array into 2D array with n equal parts
	 * if the given array cannot be split into n equal part
	 * this method should return 2D array of size 0,0 (new int[0][0])
	 * @param d
	 * @param n number of parts for the target, 0 < n <= d.length
	 * @return 2D array
	 */
	public static int[][] split(int[] d, int n) {
		if(n <= 0 || n > d.length || d.length%n != 0) {
			return new int[0][0];
		}
		int[][] res = new int[n][d.length/n];
		for(int i = 0, a = 0,b = 0; i < d.length; i++,b++) {
			res[a][b] = d[i];
			if((i+1)%(d.length/n) == 0) {
				a++;
				b = -1;
			}
		}
		return res;
	}

	public static void show(String[] x) {
		System.out.println(Arrays.toString(x));
	}

	public static void show(String[][] x2d) {
		for (String[] x : x2d) {
			show(x);
		}
	}

	public static void show(int[] x) {
		System.out.println(Arrays.toString(x));
	}
	
	public static void show(int[][] x2d) {
		for (int[] x : x2d) {
			show(x);
		}
	}
}
