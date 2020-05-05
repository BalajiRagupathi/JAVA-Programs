/**
 * 
 * Problem Statement-
 * A child is climbing up a staircase with n steps and can hop either 1 step or 2 steps at a time.
 * Implement a method to count how many possible ways the child can climb up the stairs.
 * 
 */
 import java.util.*;

/**
 * 
 * @author Kanahaiya Gupta
 */
public class Staircase {

	static int cache[];

	// Method1()-recursive solution
	// time complexity - O(2^n)
	public static int noOfWaysToClimbM1(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}
		return noOfWaysToClimbM1(n - 1) + noOfWaysToClimbM1(n - 2);

	}

	// Method2().Approach1- Top down approach (cache declaration is global)
	// time complexity - O(n)
	// space complexity - O(n)
	public static int noOfWaysToClimbM2A1(int n) {

		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}

		if (cache[n] != 0)
			return cache[n];

		return cache[n] = noOfWaysToClimbM2A1(n - 1) + noOfWaysToClimbM2A1(n - 2);

	}

	// Method2().Approach2 - Top down approach (cache is passed as the method
	// argument)
	// time complexity - O(n)
	// space complexity - O(n)
	public static int noOfWaysToClimbM2A2(int n, int cache[]) {

		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}

		if (cache[n] != 0)
			return cache[n];

		return cache[n] = noOfWaysToClimbM2A2(n - 1, cache) + noOfWaysToClimbM2A2(n - 2, cache);

	}

	// Method3()- Bottom up approach
	// time complexity - O(n)
	// space complexity - O(n)
	public static int noOfWaysToClimbM3(int n) {
		int cache[] = new int[n + 1];

		// base cases
		cache[0] = 1;
		cache[1] = 1;

		for (int i = 2; i <= n; i++)
			cache[i] = cache[i - 1] + cache[i - 2];

		return cache[n];

	}

	// Method4()- ****most efficient solution****
	// time complexity - O(n)
	// space complexity - O(1)
	public static int noOfWaysToClimbM4(int n) {
		int first = 1, second = 1, sum = 0;

		if (n < 2)
			return n;

		for (int i = 2; i <= n; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		method1(n);
		method2A1(n);
		method2A2(n);
		method3(n);
		method4(n);
		scanner.close();
	}

	public static void method1(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("noOfWaysToClimbM1 result:" + noOfWaysToClimbM1(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for noOfWaysToClimbM1() :" + executionTime + " ns");
	}

	public static void method2A1(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		cache = new int[n + 1];
		System.out.println("noOfWaysToClimbM2A1 result:" + noOfWaysToClimbM2A1(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for noOfWaysToClimbM2A1() :" + executionTime + " ns");
	}

	public static void method2A2(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		cache = new int[n + 1];
		System.out.println("noOfWaysToClimbM2A2 result:" + noOfWaysToClimbM2A2(n, new int[n + 1]));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for noOfWaysToClimbM2A2() :" + executionTime + " ns");
	}

	public static void method3(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("noOfWaysToClimbM3 result:" + noOfWaysToClimbM3(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for noOfWaysToClimbM3() :" + executionTime + " ns");
	}

	public static void method4(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("noOfWaysToClimbM4 result:" + noOfWaysToClimbM4(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for noOfWaysToClimbM4() :" + executionTime + " ns");
	}
}