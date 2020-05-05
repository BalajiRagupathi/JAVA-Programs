/**
 * 
 * Problem Statement-
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *  
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 * of money you can rob tonight without alerting the police.
 * 
 */
import java.util.*;

/**
 * 
 * @author Kanahaiya Gupta
 */
public class HouseRobber {

	static int cache[];

	// Method1()-recursive solution
	// time complexity - O(2^n)
	public static int robM1(int[] A, int i) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		if (i < 0)
			return 0;

		int ith_house_is_selected = robM1(A, i - 2) + A[i];
		int ith_house_is_not_selected = robM1(A, i - 1);

		return Math.max(ith_house_is_selected, ith_house_is_not_selected);

	}

	// Method2().Approach1- Top down approach (cache declaration is global)
	// time complexity - O(n)
	// space complexity - O(n)
	public static int robM2A1(int[] A, int i) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		if (i < 0)
			return 0;

		if (cache[i] != 0)
			return cache[i];

		int ith_house_is_selected = robM2A1(A, i - 2) + A[i];
		int ith_house_is_not_selected = robM2A1(A, i - 1);

		return cache[i] = Math.max(ith_house_is_selected, ith_house_is_not_selected);

	}

	// Method2().Approach2 - Top down approach (cache is passed as the method
	// argument)
	// time complexity - O(n)
	// space complexity - O(n)
	public static int robM2A2(int[] A, int i, int cache[]) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		if (i < 0)
			return 0;

		if (cache[i] != 0)
			return cache[i];

		int ith_house_is_selected = robM2A2(A, i - 2, cache) + A[i];
		int ith_house_is_not_selected = robM2A2(A, i - 1, cache);

		return cache[i] = Math.max(ith_house_is_selected, ith_house_is_not_selected);

	}

	// Method3()- Bottom up approach
	// time complexity - O(n)
	// space complexity - O(n)
	public static int robM3(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		int[] cache = new int[A.length + 1];

		// base cases
		cache[0] = A[0];
		cache[1] = Math.max(A[0], A[1]);

		for (int i = 2; i < A.length; i++) {
			cache[i] = Math.max(cache[i - 2] + A[i], cache[i - 1]);
		}
		return cache[A.length - 1];

	}

	// Method4()- ****most efficient solution****
	// time complexity - O(n)
	// space complexity - O(1)
	public static int robM4(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length == 1)
			return A[0];

		int prev2 = A[0];
		int prev1 = Math.max(A[0], A[1]);

		for (int i = 2; i < A.length; i++) {
			int tmp = prev1;
			prev1 = Math.max(prev2 + A[i], prev1);
			prev2 = tmp;
		}
		return prev1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no. of elements");
		int n = sc.nextInt();
//		System.out.println("enter the " + n + " elements");
		int A[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		method1(A);
		method2A1(A);
		method2A2(A);
		method3(A);
		method4(A);
		sc.close();
	}

	public static void method1(int[] A) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("robM1 result:" + robM1(A, A.length - 1));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for robM1() :" + executionTime + " ns \n");
	}

	public static void method2A1(int[] A) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		cache = new int[A.length + 1];
		System.out.println("robM2A1 result:" + robM2A1(A, A.length - 1));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for robM2A1() :" + executionTime + " ns \n");
	}

	public static void method2A2(int[] A) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		int[] cache = new int[A.length + 1];
		System.out.println("robM2A2 result:" + robM2A2(A, A.length - 1, cache));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for robM2A2() :" + executionTime + " ns \n");
	}

	public static void method3(int[] A) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("robM3 result:" + robM3(A));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for robM3() :" + executionTime + " ns \n");
	}

	public static void method4(int[] A) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("robM4 result:" + robM4(A));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for robM4() :" + executionTime + " ns \n");
	}
}