package page32;

import java.util.Scanner;

public class try13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int n = scan.nextInt();
			if (i % 2 == 0)
				sum += n;

		}
		System.out.println(sum);
		scan.close();
	}
}
