package code1;

public class UnaryOperators {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Increments");
		System.out.println(a++); //post-increment
		System.out.println(a);
		System.out.println(++a); //pre-increment
		System.out.println(a);
		System.out.println("Decrements");
		System.out.println(a--); //post-decrement
		System.out.println(a);
		System.out.println(--a); //pre-decrement
		System.out.println(a);
		System.out.println("Conversion");
		System.out.println(-a);
		System.out.println(-(-a));
		System.out.println("Not operetaor");
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
	}
}
