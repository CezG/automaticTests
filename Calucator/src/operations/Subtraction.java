package operations;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

public class Subtraction {

	public double subtraction(EnumLength unit, Length... table) {
		double result = 2 * table[0].getData();
		for (Length x : table) {
			result -= x.getData();
		}
		return result / unit.converter;
	}

	public double subtraction(EnumWeight unit, Weight... table) {
		double result = 2 * table[0].getData();
		for (Weight x : table) {
			result -= x.getData();
		}
		return result / unit.converter;
	}

	public static void main(String[] args) {
		Length u1 = new Length(5, EnumLength.M);
		u1.showData();
		Length u2 = new Length(7, EnumLength.KM);
		u2.showData();
		Subtraction s = new Subtraction();
		double r1 = s.subtraction(EnumLength.KM, u1, u2);
		System.out.println(r1);

		Weight u3 = new Weight(6, EnumWeight.KG);
		u3.showData();
		Weight u4 = new Weight(8, EnumWeight.T);
		u4.showData();
		Subtraction s2 = new Subtraction();
		double r2 = s2.subtraction(EnumWeight.KG, u3, u4);
		System.out.println(r2);
	}

}
