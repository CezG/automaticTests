package operations;

import units.EnumLength;
import units.Length;

public class Sum {

	public double sum(EnumLength unitLength, Length... table) {
		double result = 0;
		for (Length x : table) {
			result += x.getData();
		}
		return result / unitLength.converter;
	}

	public static void main(String[] args) {
		Length u1 = new Length(5, EnumLength.M);
		u1.showData();
		Length u2 = new Length(7, EnumLength.KM);
		u2.showData();
		Sum s = new Sum();
		double r = s.sum(EnumLength.KM, u1, u2);
		System.out.println(r);
	}

}
