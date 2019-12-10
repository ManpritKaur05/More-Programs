package Programs;

public class NumberIsPwerOfTwoOrNot {

	public static void main(String[] args) {

		int num = 32;

		if (isPowerTwo(num)) {
			System.out.println("Yes, " + num + " is power of two");
		} else {
			System.out.println("No, " + num + " is not power of two");
		}
	}

	static boolean isPowerTwo(int num) {

		if (num == 0)
			return false;

		while (num != 1) {

			if (num % 2 != 0)
				return false;

			num = num / 2;
		}

		return true;
	}

}
