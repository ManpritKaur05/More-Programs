package Programs;

public class GCDOrHCFOfTwoNo {

	public static void main(String[] args) {

		int num1 = 98, num2 = 56;

		System.out.println(HCF(num1, num2));
	}

	public static int HCF(int a, int b) {

		if (a == 0)
			return b;

		return HCF(b % a, a);
	}

}
