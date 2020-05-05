import java.util.*;

public class FibonacciNumber {

	// method1()-recursive solution
	// time complexity - O(2^n)
	public static int fibM1(int n) {
		if (n < 2)
			return n;
		return fibM1(n - 1) + fibM1(n - 2);

	}

	// method2()- Top down approach
	// time complexity - O(n)
	// space complexity - O(n)
	public static int fibM2(int n,int cache[]) {

		if (n < 2)
			return n;

		if (cache[n] != 0)
			return cache[n];

		return cache[n] = fibM2(n - 1,cache) + fibM2(n - 2,cache);

	}
		
	

	// method3()- Bottom up approach
	// time complexity - O(n)
	// space complexity - O(n)
	public static int fibM3(int n) {
		int cache[] = new int[n + 1];

		// base cases
		cache[0] = 0;
		cache[1] = 1;

		for (int i = 2; i <= n; i++)
			cache[i] = cache[i - 1] + cache[i - 2];

		return cache[n];

	}

	// method4()- most efficient solution
	// time complexity - O(n)
	// space complexity - O(1)
	public static int fibM4(int n) {
		int first = 0, second = 1, sum = 0;
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
		method2(n);
		method3(n);
		method4(n);
		scanner.close();
	}

	public static void method1(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("fibM1 result:" + fibM1(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for fibM1() :" + executionTime);
	}

	public static void method2(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("fibM2 result:" + fibM2(n,new int[n+1]));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for fibM2() :" + executionTime);
	}

	public static void method3(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("fibM3 result:" + fibM3(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for fibM3() :" + executionTime);
	}

	public static void method4(int n) {
		long startTime = 0, endTime = 0, executionTime = 0;
		startTime = System.nanoTime();
		System.out.println("fibM4 result:" + fibM4(n));
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("executionTime for fibM4() :" + executionTime);
	}
}