package testing;

public class DiaryTest {
	private int value;

	private DiaryTest(int tVal) {
	int value = tVal * 2;
	this.value = value * 2;
	value = value * 3;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		int tVal = 2;
		DiaryTest t = new DiaryTest(tVal);
		System.out.println(tVal + " " + t.getValue());
	}
}