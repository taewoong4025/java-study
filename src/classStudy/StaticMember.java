package classStudy;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}

	public static double toKWR(double dollar) {
		return dollar*rate;
	}

	public static void setRate(double r) {
		rate=r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환율(달러)>>");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(100000)+"입니다.");
		System.out.println("$100는"+CurrencyConverter.toKWR(100)+"입니다.");
		sc.close();
	}
}
