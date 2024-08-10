package testing;

public class test1 {
	public static boolean methodA() {
		System.out.print("A");
		return true;
	}

	public static boolean methodB() {
		System.out.print("B");
		return true;
	}

	public static void main(String[] args) {
		if (!methodA() && methodB())
			System.out.print("C");
		else
			System.out.print("D");
	}
}
