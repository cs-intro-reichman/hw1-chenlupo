// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		int min_a_b = Math.min(a, b);
		int min = Math.min(min_a_b, c);
		int max_a_b = Math.max(a,b);
		int max = Math.max(max_a_b, c);
		int mid = a + b + c - min - max;
		System.out.println(a + ", " + b + ", " + c);
		System.out.println(min + ", " + mid + ", " + max);
	}
}
